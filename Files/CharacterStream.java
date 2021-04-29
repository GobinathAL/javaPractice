import java.io.*;
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

        BufferedWriter bWriter = new BufferedWriter(new FileWriter(file));
        System.out.println("Enter a word to be replaced");
        String replacedWord = sc.nextLine();
        if(!arr.contains(replacedWord)) {
            System.out.println(replacedWord + " is not found in " + file.getName());
            bWriter.write(arr);
            bWriter.close();
            return;
        }
        System.out.println("Enter the replacing word");
        String replacingWord = sc.nextLine();
        arr = arr.replace(replacedWord, replacingWord);
        bWriter.write(arr + "\n");
        bWriter.close();
        System.out.println("All occurances of " + replacedWord + " has been replaced with " + replacingWord);
    }
}
