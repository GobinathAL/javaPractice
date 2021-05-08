import java.util.Scanner;
import java.net.*;
import java.io.*;
public class LetterClient1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket clientSocket = new Socket("127.0.0.1", 5825);
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);
        DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
        dos.writeChar(a);
        System.out.println("Sent " + a + " to server");
        dos.close();
        sc.close();
    }
}
