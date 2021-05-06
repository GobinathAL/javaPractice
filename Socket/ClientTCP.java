import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while((s = sc.nextLine()) != null) {
            try {
                Socket clientSocket = new Socket("127.0.0.1", 5825);
                DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
                dos.writeUTF(s);
                dos.close();
                clientSocket.close();
                if(s.length() == 0) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
