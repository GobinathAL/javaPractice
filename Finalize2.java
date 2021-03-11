import java.util.Scanner;
class Rectangle {
    double length, width;
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    protected void finalize() {
        System.out.println("Object destroyed by garbage collector");
    }
}
public class Finalize2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] arr = new Rectangle[10];
        int n;
        System.out.println("Enter number of rectangles");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter length & width for rectangle " + (i + 1));
            arr[i] = new Rectangle();
            arr[i].length = sc.nextDouble();
            arr[i].width = sc.nextDouble();
        }
        for(int i = 0; i < n; i++) {
            System.out.println("\nRectangle " + (i + 1));
            System.out.println("Area: " + arr[i].getArea());
            System.out.println("Perimeter: " + arr[i].getPerimeter());
        }
        for(int i=0; i<n; i++){
            arr[i] = null;                                                                                    
        }  
        System.gc();
    }    
}
