import java.util.Scanner;
import java.io.*;
import java.net.*;
class Structure {
    char a;
    int b;
    float c;
    public Structure(char a, int b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class ObjectClient1 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner sc = new Scanner(System.in);
        Socket clientSocket = new Socket("127.0.0.1", 5825);
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);
        System.out.println("Enter an integer");
        int b = sc.nextInt();
        System.out.println("Enter a float");
        float c = sc.nextFloat();
        Structure obj = new Structure(a, b, c);
        ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
        oos.writeObject(obj);
        oos.close();
    }
}
