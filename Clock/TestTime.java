import java.util.Scanner;
public class TestTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours, minutes, seconds");
        Time t1, t2;
        while(true) {
            int hour = sc.nextInt();
            int minutes = sc.nextInt();
            int seconds = sc.nextInt();
            try {
                t1 = new TwelveHrClock(seconds, minutes, hour);
                t2 = new TwentyFrHrClock(seconds, minutes, hour);
                break;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\n12 hr clock");
        t1.display();
        System.out.println("24 hr clock");
        t2.display();
        sc.close();
    }
}