# Exemplo de Interface e Desacoplamento

Este projeto apresenta um exemplo prático do uso de interfaces para desacoplar componentes de um sistema, utilizando a linguagem Java.

## Objetivo

Demonstrar como uma interface pode definir um contrato que permite utilizar diferentes implementações sem que o componente consumidor precise conhecer os detalhes da implementação concreta.

## Estrutura do projeto

* `Notificacao.java` — interface que define o contrato.
* `EmailNotificacao.java` — implementação da interface para envio de e-mail.
* `SmsNotificacao.java` — implementação da interface para envio de SMS.
* `SistemaNotificacao.java` — componente consumidor que depende apenas da interface.
* `Main.java` — classe responsável por executar o exemplo.

## Funcionamento

A interface `Notificacao` define o método `enviar`, estabelecendo o contrato que deve ser seguido pelas implementações.

As classes `EmailNotificacao` e `SmsNotificacao` implementam a interface de maneiras diferentes.

O `SistemaNotificacao` depende apenas da interface `Notificacao`, e não diretamente das classes `EmailNotificacao` ou `SmsNotificacao`.

Isso permite substituir uma implementação por outra sem precisar modificar o componente consumidor.

## Exemplo

O sistema pode receber diferentes implementações:

```java
Notificacao email = new EmailNotificacao();
SistemaNotificacao sistemaEmail = new SistemaNotificacao(email);

Notificacao sms = new SmsNotificacao();
SistemaNotificacao sistemaSms = new SistemaNotificacao(sms);
```

## Saída esperada

```text
Enviando e-mail: Pedido realizado com sucesso!
Enviando SMS: Seu código é 123456.
```

## Conceito demonstrado

O projeto demonstra o uso de uma interface como contrato para promover o desacoplamento entre componentes. O consumidor conhece apenas a interface `Notificacao`, permitindo que diferentes implementações sejam utilizadas sem alterar seu código.
