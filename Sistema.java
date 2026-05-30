/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.mola;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Sistema {
    private byte opcao;
    private byte opp;
    private byte op;
    private int numero;
    private int valor;
    private int pin;
    public String partida;
    public int saldo=1000;
    public byte taxa=0;
    public String codigo;
    
    LocalTime hora = LocalTime.now();
        LocalDate data = LocalDate.now();
        int hor = hora.getHour();
        int min = hora.getMinute();
       
    public void iniciar(){
        Scanner et=new Scanner(System.in);
        System.out.println("DIGITE O CODIGO USSD DO SERVICO DESEJADO( M-pesa/E-mola");
          partida=et.nextLine();
        if(partida.equals("*150#")){
            descrever();
        System.out.println("Escolha opcao:");
        opcao=et.nextByte();
        escolher(et);
        dar(et);
        et.close();
         }else{
                
        if(partida.equals("*898#")){
            escrever();
        System.out.println("Escolha opcao:");
        opcao=et.nextByte();
        prever(et);
        et.close(); 
        }else{
             System.err.println("ACESSO INVALIDO");  
        }
           
        }
     
        
    }

    private void descrever(){
        System.out.println("M PESA");
        System.out.println("1.TRANSFERIR DINHEIRO");
        System.out.println("2. LEVANTAR DINHEIRO");
        System.out.println("3.XITIQUE M-PESA");
        System.out.println("4.RECARGAS, VOZ e DADOS");
        System.out.println("5.PAGAMENTOS");
        System.out.println("6.MINHA CONTA");
        
        System.out.println("                             ");
    }
                    private void dar(Scanner et){
       
                        System.out.println("1.Para o meu numero");
                        System.out.println("2.Para outro numero");
                        System.out.println("00.Menu Principal");
                        op=et.nextByte();
                        switch(op){
                            case 1:
                                 System.out.println("1.So Pra Ti");
                                System.out.println("2.Chamadas e SMS");
                                System.out.println("3.Super Jackpot");
                                System.out.println("4.Megas YA");
                                System.out.println("                   ");
                                System.out.println("0.VOLTAR");
                                System.out.println("5.Menu Principal");
                                opp=et.nextByte();
                                switch(opp){
                                       case 1:
                                        System.out.println("SERVICO INDISPONIVEL NO MOMENTO");
                                        break;
                                       case 2:   
                                        System.out.println("1.Voda Jackpot");
                                        System.out.println("2.Todas Redes Jackpot");
                                        System.out.println("3.Bom Dia");
                                        System.out.println("4.Meu Numero 1");
                                        System.out.println("5.SMS");
                                        System.out.println("6.Turno da noite");
                                        System.out.println("           ");
                                        System.out.println("0.voltar");
                                        System.out.println("00.Menu Principal");
                                        break;
                                       case 0:
                                           dar(et);
                                           et.close();
                                           break;
                                       case 5 :
                                           descrever();
                                           System.out.println("Escolha opcao:");
                                               opcao=et.nextByte();
                                            escolher(et);
                                            dar(et);
                                             et.close(); 
                                             break;
                                           
                                           
                                           
                                           
                                }
                            case 2:
                                System.out.println("SERVICO INDISPONIVEL");break;
                            case 00:
                                   descrever();
                                  System.out.println("Escolha opcao:");
                                  opcao=et.nextByte();
                                   escolher(et);
                                   dar(et);
                                   et.close();
                                   break;
                                   
                            default :
                                System.out.println("OPCAO INVALIDA");break;
                                
                        }
       
                        
    }
    
    private void escolher(Scanner et){
        if(opcao == 1){
            System.out.println("SEM TAXAS transferencias de qualquer valor de M pesa para M pesa");
            System.out.println("1. M PESA(free of charges)");
            System.out.println("2. Banco");
            System.out.println("3. Carteira movel");
            System.out.println("00.VOLTAR AO MENU");
            System.out.println("                    ");
             opp=et.nextByte();
             switch(opp){
                 case 1:
                     System.out.println("DIGITE UM NUMERO VALIDO:");
                     numero=et.nextInt();
                     if(numero>=840000000 && numero<860000000 ){
                         
                     System.out.println("DIGITA O VALOR:");
                     valor=et.nextInt();
                     saldo=saldo-valor;
                     System.out.println("POR FAVOR, INTRODUZA O PIN");
                     pin=et.nextInt();
                     if(pin==2024){
                     System.out.println("                      ");
                     System.out.println("TRANFERIR "+this.valor+" MT PARA EU****O T****E COM O NUMERO "+this.numero);
                     System.out.println("1.SIM");
                     System.out.println("2.NAO");
                     op=et.nextByte();
                        if(op==1){
                         System.out.println("CONFIRMADO,PELAS "+hor + ":" + min + "AM, " + data +" TRANSFERISTE "+this.valor+" MT PARA A EUGENIO TEBETE  E A TAXA FOI DE 0.00MT. O SEU NOVO SALDO E DE "+this.saldo+".00MT");
                            System.out.println("Mpesa, facilita a tua vida");
                         }else{
                         System.out.println("OPERACAO CANCELADA");
                         }
                        
                        
                     }else{
                         System.err.println("PIN INVALIDO, TENTE NOVAMENTE");
                     }
                         }else{
                         System.err.println("Numero invalido, tente novamente");
                     }
                     
        
             }
                        
              
           
            
        }else{
            if(opcao==2){
                System.out.println("1.DO AGENTE");
                System.out.println("2. DA BALCONISTA");
                System.out.println("3.DA ATM");
                System.out.println("00. VOLTAR AO MENU");
                opp=et.nextByte();
                switch(opp){
                    case 1:
                        System.out.println("1.Digita o codigo do agente");
                        
                          String codigo=et.next();
                        if(codigo.length()==5 &&   codigo.matches("\\d{5}")){
                        System.out.println("                   ");
                        System.out.println("DIGITE O VALOR:");
                        valor=et.nextInt();
                        if(valor<=100 ){
                            taxa=4;
                            saldo=saldo-(valor+taxa);
                        }else{
                            if(valor>100){
                                taxa=10;
                               saldo=saldo-(valor+taxa); 
                            }
                        }
                           
                   
                           
                        System.out.println("                                         ");
                        System.out.println("DIGITE O SEU PIN:");
                        pin=et.nextInt();
                        if(pin==2024){
                        System.out.println("                                        ");
                        System.out.println("DESEJA LEVANTAR "+this.valor+" MT NO AGENTE BENTO MAVHAVA COM O CODIGO "+codigo+ "?");
                        System.out.println("1.SIM");
                        System.out.println("2.NAO");
                        op=et.nextByte();
                        if(op==1){
                            System.out.println("CONFIRMADO,PELAS "+hor + ":" + min + " AM, " + data +" LEVANTASTE "+this.valor+" MT NO AGENTE COM O CODIGO "+codigo+" E A TAXA FOI DE "+taxa+".00MT");
                            System.out.println("O SEU NOVO SALDO E DE "+this.saldo+".00MT");
                            }else{
                            if(op==2){
                                System.out.println("OPERACAO CANCELADA    ");
                                
                              }else{
                                System.out.println("OPCAO INVALIDA");
                                
                            }
                        }
                        }else{
                            System.err.println("PIN INCORRETO");
                       
                        }
                         }else{
                            System.err.println("CODIGO INVALIDO");
                         }   
          
         
                }
            }
            if(opcao==3){
                System.out.println("BEM VINDO AO xitique M PESA");
                System.out.println("Escolhe o teu xitique");
                System.out.println("1.Diario");
                System.out.println("2.Semanal");
                System.out.println("3.Termos e Condicoes");
                opp=et.nextByte();
                switch(opp){
                    case 1:
                        System.out.println("ESCOLHE A DURACAO DO XITIQUE");
                        System.out.println("1. 7 dias");
                        System.out.println("2. 30 dias");
                        op=et.nextByte();
                        switch(op){
                            case 1:
                                   System.out.println("ESCOLHE O VALOR DO XITIQUE");
                        System.out.println("1.50 MT por dia");
                        System.out.println("2.100MT por dia");
                        System.out.println("3.200MT por dia");
                        System.out.println("4.250MT por dia");
                        System.out.println("5.500MT por dia"); 
                            
                        }
                        
                }
            }
           if(opcao==6){
               System.out.println("1.Consulta");
               System.out.println("2.Tarifas");
               System.out.println("3.Rever transacao");
               System.out.println("4. Paga facil");
               System.out.println("5. Actualizar dados");
               System.out.println("6.Alterar o PIN");
              
        }else{
              // System.err.println("ENTRADA INVALIDA");
           }  
        
            if(opcao==4){
               
                System.out.println("1. RECARGAS");
                System.out.println("2.CHAMADAS,DADOS e SMS");
                System.out.println("3.SoPapo(Todas Redes)");
                System.out.println("4.ILIMITADO");
                opp=et.nextByte();
                switch(opp){
                    case 1:
                        System.out.println("PROCESSANDO");break;
                        
                       
                       
                    case 2:
                        dar(et);break;
                        
                        
                        
                        
                    case 3:
                        System.out.println("indisponivel");break;

                    case 4:
                        System.out.println("indisponivel");break;
                    default:
                        System.out.println("opcao invalida");break;
                }
               
                et.close();
            }
      
        
    }
    }
        
      private void escrever(){
        System.out.println("E-mola");
        System.out.println("1.TRANSFERIR DINHEIRO");
        System.out.println("2. LEVANTAR DINHEIRO");
        System.out.println("3.XITIQUE ");
        System.out.println("4.CREDELEC");
        System.out.println("5.PAGAMENTOS");
        System.out.println("6.MINHA CONTA");
        System.out.println("                             ");
      }
    private void prever(Scanner et){
        if(opcao == 1){
            System.out.println("SEM TAXAS transferencias de qualquer valor de E-mola para E-mola");
            System.out.println("1. E-mola(free of charges)");
            System.out.println("2. Banco");
            System.out.println("3. Carteira movel");
            System.out.println("                    ");
             opp=et.nextByte();
             switch(opp){
                 case 1:
                     System.out.println("DIGITE UM NUMERO VALIDO:");
                     numero=et.nextInt();
                     if(numero>859999999 || numero<870000000 ){
                         
                     System.out.println("DIGITA O VALOR:");
                     valor=et.nextInt();
                     saldo=saldo-valor;
                     System.out.println("POR FAVOR, INTRODUZA O PIN");
                     pin=et.nextInt();
                     if(pin==202400){
                     System.out.println("                      ");
                     System.out.println("TRANFERIR "+this.valor+" MT PARA L***A T****E COM O NUMERO "+this.numero);
                     System.out.println("1.SIM");
                     System.out.println("2.NAO");
                     op=et.nextByte();
                        if(op==1){
                         System.out.println("CONFIRMADO,PELAS "+hor + ":" + min + "AM, " + data +" TRANSFERISTE "+this.valor+" MT PARA A LIDIA TOVELE  E A TAXA FOI DE 0.00MT. O SEU NOVO SALDO E DE "+this.saldo+".00MT");
                            System.out.println("E-mola, em todo lugar, a todo momento");
                         }else{
                         System.out.println("OPERACAO CANCELADA");
                         }
                        
                        
                     }else{
                         System.err.println("PIN INVALIDO, TENTE NOVAMENTE");
                     }
                         }else{
                         System.err.println("Numero invalido, tente novamente");
                     }
                     
                     
             }
                        
              
           
            
        }else{
            if(opcao==2){
                System.out.println("1.DO AGENTE");
                System.out.println("2. DA BALCONISTA");
                System.out.println("3.DA ATM");
                System.out.println("00. VOLTAR");
                opp=et.nextByte();
                switch(opp){
                    case 1:
                        System.out.println("Digita o codigo do agente");
                          String codigo=et.next();
                        if(codigo.length()==6 &&   codigo.matches("\\d{6}")){
                        System.out.println("                   ");
                        System.out.println("DIGITE O VALOR:");
                        valor=et.nextInt();
                        if(valor<=100 ){
                            taxa=3;
                            saldo=saldo-(valor+taxa);
                        }else{
                            if(valor>100){
                                taxa=8;
                               saldo=saldo-(valor+taxa); 
                            }
                        }
                           
                   
                           
                        System.out.println("                                         ");
                        System.out.println("DIGITE O SEU PIN:");
                        pin=et.nextInt();
                        if(pin==202400){
                        System.out.println("                                        ");
                        System.out.println("DESEJA LEVANTAR "+this.valor+" MT NO AGENTE BENTO MAVHAVA COM O CODIGO "+codigo+ "?");
                        System.out.println("1.SIM");
                        System.out.println("2.NAO");
                        op=et.nextByte();
                        if(op==1){
                            System.out.println("CONFIRMADO,PELAS "+hor + ":" + min + " AM, " + data +" LEVANTASTE "+this.valor+" MT NO AGENTE COM O CODIGO "+codigo+" E A TAXA FOI DE "+taxa+".00MT");
                            System.out.println("O SEU NOVO SALDO E DE "+this.saldo+".00MT");
                            }else{
                            if(op==2){
                                System.out.println("OPERACAO CANCELADA    ");
                              }else{
                                System.out.println("OPCAO INVALIDA");
                                
                            }
                        }
                        }else{
                            System.err.println("PIN INCORRETO");
                       
                        }
                         }else{
                            System.err.println("CODIGO INVALIDO");
                         }   
                    case 2:
                        System.out.println("");
                }
                
            }
            if(opcao==3){
                System.out.println("BEM VINDO AO xitique E-mola");
                System.out.println("Escolhe o teu xitique");
                System.out.println("1.Diario");
                System.out.println("2.Semanal");
                System.out.println("3.Termos e Condicoes");
                opp=et.nextByte();
                switch(opp){
                    case 1:
                        System.out.println("ESCOLHE A DURACAO DO XITIQUE");
                        System.out.println("1. 7 dias");
                        System.out.println("2. 30 dias");
                        op=et.nextByte();
                        switch(op){
                            case 1:
                                   System.out.println("ESCOLHE O VALOR DO XITIQUE");
                        System.out.println("1.50 MT por dia");
                        System.out.println("2.100MT por dia");
                        System.out.println("3.200MT por dia");
                        System.out.println("4.250MT por dia");
                        System.out.println("5.500MT por dia"); 
                            
                        }
                        
                }
            }
           if(opcao==6){
               System.out.println("1.Consulta");
               System.out.println("2.Tarifas");
               System.out.println("3.Rever transacao");
               System.out.println("4. Paga facil");
               System.out.println("5. Actualizar dados");
               System.out.println("6.Alterar o PIN");
              
        }else{
              // System.err.println("ENTRADA INVALIDA");
           }  
            
        }
         

    } 
      
    public byte getOpcao() {
        return opcao;
    }

    public void setOpcao(byte opcao) {
        this.opcao = opcao;
    }
     public byte getOpp() {
        return opp;
    }

    public void setOpp(byte opp) {
        this.opp = opp;
    }
      public byte getOp() {
        return op;
    }

    public void setOp(byte op) {
        this.op = op;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getValor() {
        return valor;  
        }
         

    } 
      
   
