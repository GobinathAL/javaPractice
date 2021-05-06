import java.io.IOException;
import java.net.*;

public class ReceiverUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket receiverSocket = new DatagramSocket(5825);
        InetAddress ip = InetAddress.getLocalHost();
        
        while(true) {
            byte[] buf = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(buf, buf.length);
            receiverSocket.receive(dpReceive);
            String s = "";
            for(int i = 0; buf[i] != 0; i++) {
                s += (char) buf[i];
            }
            System.out.println(s);
            if(s.length() == 0) break;
        }
    }
}
