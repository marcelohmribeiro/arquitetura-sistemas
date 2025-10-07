public class Teste {
    private Channel ch;

    public Teste(ChannelFactory factory) {
        this.ch = factory.createChannel();
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}
