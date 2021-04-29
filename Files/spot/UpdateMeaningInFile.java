import java.io.*;
import java.util.Scanner;

public class UpdateMeaningInFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileReader fileReader = new FileReader("dictionary.txt");
        char[] cbuf = new char[1024];
        int n = fileReader.read(cbuf);
        cbuf[n] = '\0';
        fileReader.close();
        String updatedBuffer = new String(cbuf, 0, n);

        System.out.println("Enter a word for which the meaning should be updated");
        String word = sc.nextLine();
        if(!updatedBuffer.contains(word)) {
            System.out.println("Word not found");
            return;
        }
        System.out.println("Enter the new meaning");
        String meaning = sc.nextLine();
        
        int start = updatedBuffer.indexOf(word) + word.length() + 4;
        int end = updatedBuffer.indexOf("\n", start);
        StringBuffer sbf = new StringBuffer(updatedBuffer).replace(start, end, meaning);
        FileWriter fileWriter = new FileWriter("dictionary.txt");
        fileWriter.write(sbf.toString());
        fileWriter.close();
        System.out.println("Updated the meaning of " + word);
    }
}
