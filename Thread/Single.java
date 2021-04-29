import java.util.Scanner;

class PrintThread implements Runnable {
    int n;
    public PrintThread(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        for(int i = 0; i < n; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Single {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Thread thread = new Thread(new PrintThread(n));
        thread.start();
    }
}