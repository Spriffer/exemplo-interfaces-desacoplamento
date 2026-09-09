# Exemplo de Interface e Desacoplamento

Exemplo prático do uso de interfaces para desacoplar componentes de um sistema, utilizando Java.

## Objetivo

Demonstrar como uma interface permite utilizar diferentes implementações sem que o componente consumidor dependa diretamente delas.

## Estrutura

* `Notificacao.java` — define a interface e o contrato.
* `EmailNotificacao.java` — implementação para e-mail.
* `SmsNotificacao.java` — implementação para SMS.
* `SistemaNotificacao.java` — componente consumidor.
* `Main.java` — executa o exemplo.

## Funcionamento

A interface `Notificacao` define o método `enviar()`.

`EmailNotificacao` e `SmsNotificacao` implementam essa interface de formas diferentes.

O `SistemaNotificacao` depende apenas da interface `Notificacao`, permitindo utilizar qualquer implementação sem alterar seu código.

## Exemplo

```java
Notificacao email = new EmailNotificacao();
SistemaNotificacao sistemaEmail = new SistemaNotificacao(email);

Notificacao sms = new SmsNotificacao();
SistemaNotificacao sistemaSms = new SistemaNotificacao(sms);
```

## Saída

```text
Enviando e-mail: Pedido realizado com sucesso!
Enviando SMS: Seu código é 123456.
```

## Conceito

O exemplo demonstra como interfaces ajudam a reduzir o acoplamento entre componentes, permitindo trocar ou adicionar implementações sem modificar o componente consumidor.
