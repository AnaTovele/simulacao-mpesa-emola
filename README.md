# Simulação M-Pesa / E-mola

Projecto de aprendizagem desenvolvido em Java que simula o fluxo de utilização dos serviços de pagamento móvel **M-Pesa** (`*150#`) e **E-mola** (`*898#`) em Moçambique.

---

## Motivação

Este projecto nasceu da curiosidade em entender como funcionam os sistemas USSD de pagamento móvel mais utilizados em Moçambique. O objectivo foi recriar o fluxo de navegação e as operações principais de forma programática, aplicando conceitos de Programação Orientada a Objectos em Java.

---

## Funcionalidades simuladas

**M-Pesa (`*150#`)**
- Transferência de dinheiro (M-Pesa para M-Pesa, sem taxas)
- Levantamento via agente 
- Xitique M-Pesa
- Recargas, Voz e Dados
- Minha Conta

**E-mola (`*898#`)**
- Transferência de dinheiro (E-mola para E-mola, sem taxas)
- Levantamento via agente 
- Xitique E-mola
- Credelec
- Minha Conta

---

## Conceitos aplicados

- Programação Orientada a Objectos (POO)
- Estruturas de controlo (`if/else`, `switch`)
- Entrada de dados via `Scanner`
- Data e hora em tempo real (`LocalDate`, `LocalTime`)
- Validação de números de telefone por intervalo
- Cálculo de taxas por escalão de valor

---

## Estrutura do projecto

```
e.mola/
├── EMola.java      # Classe principal (main)
└── Sistema.java    # Lógica do sistema USSD
```

---

## Como executar

1. Clona o repositório:
```bash
git clone https://github.com/AnaTovele/emola-mpesa-simulacao.git
```

2. Abre no NetBeans ou noutra IDE Java

3. Executa a classe `EMola.java`

4. Quando solicitado, digita:
   - `*150#` para M-Pesa
   - `*898#` para E-mola

---

## Exemplo de uso

```
DIGITE O CODIGO USSD DO SERVICO DESEJADO( M-pesa/E-mola
*150#

M PESA
1.TRANSFERIR DINHEIRO
2. LEVANTAR DINHEIRO
3.XITIQUE M-PESA
4.RECARGAS, VOZ e DADOS
5.PAGAMENTOS
6.MINHA CONTA

Escolha opcao:
```

---

## ⚠️ Aviso

Este é um projecto académico de simulação desenvolvido para fins de aprendizagem.
Não tem qualquer ligação real com a Vodacom Moçambique, M-Pesa ou E-mola.
Os dados utilizados são fictícios.

---

## Autora

**Ana Rafica Tovele** — Desenvolvedora Full Stack  
🇲🇿 Moçambique  
[![GitHub](https://img.shields.io/badge/GitHub-AnaTovele-black?logo=github)](https://github.com/AnaTovele)
