import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;
public class CharacterStream {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Filename: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String arr="", temp;
        while((temp = bReader.readLine()) != null) {
            arr += temp;
        }
        bReader.close();
        System.out.println(arr);

        BufferedWriter bWriter = new BufferedWriter(new FileWriter("output.txt"));
        bWriter.write(arr);
        bWriter.close();
        System.out.println("Contents of " + file.getName() + "has been copied to output.txt");
    }
}
