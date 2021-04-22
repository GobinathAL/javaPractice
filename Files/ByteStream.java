import java.io.*;
import java.util.Scanner;
public class ByteStream {
    public static void main(String[] args) throws IOException{
            Scanner sc = new Scanner(System.in);
            System.out.println("Filename: ");
            String fileName = sc.nextLine();
    
            File file = new File(fileName);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            String arr="";
            int ch;
            while((ch = bis.read()) != -1) {
                arr += (char) ch;
            }
            bis.close();
            System.out.println(arr);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output2.txt"));
            bos.write(arr.getBytes());
            bos.close();
            System.out.println("Written contents of " + file.getName() + " to output2.txt");
    }
}
