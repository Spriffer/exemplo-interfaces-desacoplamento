public class SistemaNotificacao {
    private Notificacao notificacao;

    public SistemaNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void notificar(String mensagem) {
        notificacao.enviar(mensagem);
    }
}