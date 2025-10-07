public class UDPChannelFactory implements ChannelFactory {
    public Channel createChannel() {
        return new UDPChannel();
    }
}