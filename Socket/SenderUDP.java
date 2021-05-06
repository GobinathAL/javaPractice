import java.io.IOException;
import java.net.*;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class SenderUDP {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InetAddress ip = InetAddress.getLocalHost();
        DatagramSocket senderSocket = new DatagramSocket();
        while(true) {
            String s = sc.nextLine();
            byte[] buf = s.getBytes();
            
            DatagramPacket dpSend = new DatagramPacket(buf, buf.length, ip, 5825);
            senderSocket.send(dpSend);
            if(s.length() == 0) break;
        }
        senderSocket.close();
        sc.close();
    }
}
