public class TCPChannelFactory implements ChannelFactory {
    public Channel createChannel() {
        return new TCPChannel();
    }
}