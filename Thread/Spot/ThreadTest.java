import java.util.*;
class Storage {
    int n;
    public synchronized void setValue(int n) {
        this.n = n;
    }
    public synchronized int getValue() {
        return this.n;
    }
}
class Printer implements Runnable {
    Storage s;
    int num;
    public Printer(Storage s, int num) {
        this.s = s;
        this.num = num;
    }
    @Override
    public void run() {
        int counter = 0;
        synchronized(s) {
            while(counter < num) {
                try {
                    s.wait();
                } catch(InterruptedException e) {}
            
                System.out.println(Thread.currentThread().getName() + "\t" + (counter = s.getValue()));
                s.notify();
            }
        }
    }
}
class Counter implements Runnable {
    Storage s;
    int num;
    public Counter(Storage s, int num) {
        this.s = s;
        this.num = num;
    }
    @Override
    public void run() {
        for(int i = 0; i < num; i++) {
            synchronized(s) {
                System.out.println("\nCounter counted " + i);
                s.setValue(i);
                System.out.println(i + " stored in storage");
                s.notify();
                try {
                    s.wait();
                } catch(InterruptedException e) {}
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    }
}
public class ThreadTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Storage s = new Storage();
        Printer p = new Printer(s, num);
        Counter c = new Counter(s, num);
        Thread pThread = new Thread(p, "Printing: ");
        Thread cThread = new Thread(c, "Counter");
        pThread.start();
        cThread.start();
    }
}