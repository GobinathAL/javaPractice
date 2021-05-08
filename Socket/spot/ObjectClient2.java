import java.io.*;
import java.net.*;
public class ObjectClient2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket clientSocket = new Socket("127.0.0.1", 5825);
        ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
        Structure obj = (Structure) ois.readObject();
        ois.close();
        System.out.println("Server:\n" + obj.toString());
    }
}
