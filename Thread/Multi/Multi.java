import java.util.Scanner;

class Count {
    int counter = 0;
    public void increment() {
        counter++;
    }
    public void decrement() {
        counter--;
    }
}
class ThreadA implements Runnable {
    Count obj;
    public ThreadA(Count obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            obj.increment();
            System.out.println(obj.counter);
        }
    }
}
class ThreadB implements Runnable {
    Count obj;
    public ThreadB(Count obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            obj.decrement();
            System.out.println(obj.counter);
        }
    }
}
public class Multi {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Count obj = new Count();
        Thread t1 = new Thread(new ThreadA(obj));
        t1.setName("Increment thread");
        Thread t2 = new Thread(new ThreadB(obj));
        t2.setName("Decrement thread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}