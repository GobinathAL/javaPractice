import java.util.InputMismatchException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number between 1 and 100 inclusive");
        while(true) {
            try {
                int num = sc.nextInt();
                if(num % 2 == 0) {
                    throw new Exception("EvenNumberEntered");
                } else if(num < 1 || num > 100) {
                    throw new Exception("NumberOutOfRange");
                } else
                break;
            } catch(InputMismatchException e) {
                System.out.println("please enter an integer");
            } catch(Exception e) {
                if(e.toString().equals("EvenNumberEntered")) {
                    System.out.println("please enter an odd number");
                }
                else if(e.toString().equals("NumberOutOfRange")) {
                    System.out.println("please enter number in the range 1 to 100 inclusive");
                }
            } 
        }
    }
}