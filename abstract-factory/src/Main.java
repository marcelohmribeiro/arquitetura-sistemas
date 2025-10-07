public class Main {
    public static void main(String[] args) {
        ChannelFactory udpFactory = new UDPChannelFactory();
        ChannelFactory tcpFactory = new TCPChannelFactory();

        Teste t1 = new Teste(udpFactory);
        Teste t2 = new Teste(tcpFactory);

        t1.getMessage(); // Envia mensagem UDP
        t2.getMessage(); // Envia mensagem TCP
    }
}
