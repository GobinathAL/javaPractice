import java.util.Scanner;

class Count {
    static int counter = 0;
    public static void increment() {
        counter++;
    }
    public static void decrement() {
        counter--;
    }
}
class ThreadA implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            Count.increment();
            System.out.println(Count.counter);
        }
    }
}
class ThreadB implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            Count.decrement();
            System.out.println(Count.counter);
        }
    }
}
public class Multi {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread t1 = new Thread(new ThreadA());
        t1.setName("Increment thread");
        Thread t2 = new Thread(new ThreadB());
        t2.setName("Decrement thread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}