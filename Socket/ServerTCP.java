import java.io.*;
import java.net.*;

public class ServerTCP {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(5825);
            System.out.println("Server running");
            String s = null;
            do {
                Socket server = serverSocket.accept();
                DataInputStream dis = new DataInputStream(server.getInputStream());
                s = dis.readUTF();
                System.out.println(s);
                dis.close();
            
            } while(s.length() > 0);
        } catch (IOException e) {
            e.printStackTrace();
    }
    }
}
