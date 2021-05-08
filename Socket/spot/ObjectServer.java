import java.net.*;
import java.io.*;

public class ObjectServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket;
        serverSocket = new ServerSocket(5825);
        System.out.println("Server running");
        Socket server = serverSocket.accept();
        System.out.println("Client1 connection established");
        Socket server2 = serverSocket.accept();
        System.out.println("Client2 connection established");

        ObjectInputStream ois = new ObjectInputStream(server.getInputStream());
        Structure obj = (Structure) ois.readObject();
        ois.close();
        System.out.println("Client1:\n" + obj.toString());
        obj.a = 'A';
        obj.b = 69;
        obj.c = 2.9f;
        ObjectOutputStream oos = new ObjectOutputStream(server2.getOutputStream());
        oos.writeObject(obj);
        oos.close();

        server.close();
        server2.close();
    }
}
