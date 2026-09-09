public class Main {
    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao();
        Notificacao sms = new SmsNotificacao();

        SistemaNotificacao sistemaEmail = new SistemaNotificacao(email);
        SistemaNotificacao sistemaSms = new SistemaNotificacao(sms);

        sistemaEmail.notificar("Pedido realizado com sucesso!");
        sistemaSms.notificar("Seu código é 123456.");
    }
}