import java.net.*;
import java.io.*;
public class LetterServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket;
        serverSocket = new ServerSocket(5825);
        System.out.println("Server running");
        Socket server = serverSocket.accept();
        System.out.println("Client1 connection established");
        Socket server2 = serverSocket.accept();
        System.out.println("Client2 connection established");
        DataInputStream dis = new DataInputStream(server.getInputStream());
        char a = dis.readChar();
        dis.close();
        System.out.println("Client1: " + a);
        DataOutputStream dos = new DataOutputStream(server2.getOutputStream());
        if(a == 'a') a = 'z';
        else if(a == 'A') a = 'Z';
        else a = (char) (((int) a) - 1);
        dos.writeChar(a);
        dos.close();

        server.close();
        server2.close();
    }
}
