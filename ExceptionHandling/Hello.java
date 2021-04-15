import java.util.InputMismatchException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements in an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            int num;
            System.out.println("Enter an odd number between 1 and 100 inclusive");
            while(true) {
                try {
                    num = sc.nextInt();
                    if(num < 1 || num > 100) {
                        throw new Exception("NumberOutOfRange");
                    } else if(num % 2 == 0) {
                        throw new Exception("EvenNumberEntered");
                    } else break;
                } catch(Exception e) {
                    if(e.toString().contains("NumberOutOfRange")) {
                        System.out.println("please enter number in the range 1 to 100 inclusive");
                    } else if(e.toString().contains("EvenNumberEntered")) {
                        System.out.println("please enter an odd number");
                    }
                    
                } 
            }
            a[i] = num;
       }
       for(int i = 0; i < n; i++) {
           System.out.println(a[i]);
       }
    }
}