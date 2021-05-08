import java.net.*;
import java.io.*;
public class LetterClient2 {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 5825);
        DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
        char a = dis.readChar();
        dis.close();
        System.out.println("Server: " + a);
        sc.close();
    }
}