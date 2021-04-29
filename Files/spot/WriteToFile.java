import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("dictionary.txt");
        while (true) {
            String word = "";
            try {
                System.out.print("Word: ");
                word = sc.nextLine();
            } catch (Exception e) {
                break;
            }
            System.out.print("Meaning: ");
            String meaning = sc.nextLine();
            fileWriter.append(word + "    " + meaning + "\n");
        }
        System.out.println("\nWritten to file: dictionary.txt");
        fileWriter.close();
    }
}