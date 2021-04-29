import java.util.Scanner;

class Count {
    int counter = 0;
    boolean canDecrement = false;
    public synchronized void increment() {
        while(canDecrement) {
            try{
                wait();
            } catch(Exception e) {}
        }
        for(int i = 0; i < 5; i++) {
            counter++;
            System.out.println(counter);
        }
        canDecrement = true;
        notify();
    }
    public synchronized void decrement() {
        while(!canDecrement) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 5; i++) {
            counter--;
            System.out.println(counter);
        }
        canDecrement = false;
        notify();
    }
}
class ThreadA implements Runnable {
    Count obj;
    public ThreadA(Count obj) {
        this.obj = obj;
    } 
    @Override
    public void run() {
        obj.increment();
    }
}
class ThreadB implements Runnable {
    Count obj;
    public ThreadB(Count obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        obj.decrement();
    }
}
public class Sync {
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
    }
}