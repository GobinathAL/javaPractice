import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accno, accname, balance for savings acccount");
        SavingsAccount sa = new SavingsAccount(sc.nextInt(), sc.next(), sc.nextDouble());
        
        while(true) {
            System.out.println("1.deposit 2.withdraw 3.view balance 4.view noofTransactions 5.toString(-1 to exit)");
            int choice = sc.nextInt();
            if(choice == -1) break;
            if(choice == 1) {
                System.out.print("Enter Amount:");
                double amt = sc.nextDouble();
                sa.deposit(amt);
            }
            else if(choice == 2) {
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                sa.withdraw(amt);
            }
            else if(choice == 3) {
                System.out.println("Balance: " + sa.balance);
            }
            else if(choice == 4) {
                System.out.println("noofTransactions: " + sa.noofTransactions);
            }
            else if(choice == 5) {
                System.out.println(sa.toString());
            }
            else {
                System.out.println("Enter valid choice");
            }
        }
        System.out.println("Enter accno, accname, balance for checking account");
        CheckingAccount ca = new CheckingAccount(sc.nextInt(), sc.next(), sc.nextDouble());
        
        while(true) {
            System.out.println("1.deposit 2.withdraw 3.view balance 4.toString 5.calculate interest(-1 to exit)");
            int choice = sc.nextInt();
            if(choice == -1) break;
            if(choice == 1) {
                System.out.print("Enter Amount:");
                double amt = sc.nextDouble();
                ca.deposit(amt);
            }
            else if(choice == 2) {
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                ca.withdraw(amt);
            }
            else if(choice == 3) {
                System.out.println("Balance: " + ca.balance);
            }
            else if(choice == 4) {
                System.out.println(ca.toString());
            }
            else if(choice == 5) {
                System.out.println(ca.cal_interest());
            }
            else {
                System.out.println("Enter valid choice");
            }
        }

        if(sa instanceof Account) 
            System.out.println("Savings Account object is an instance of class Account");
        else
            System.out.println("Savings Account object is not an instance of class Account");
    }
}
