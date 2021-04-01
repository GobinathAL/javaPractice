import java.util.Scanner;

public class TestRegion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle:\nEnter x and y coordinates for center");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point center = new Point(x, y);
        System.out.print("Radius:");
        double rad = sc.nextInt();
        Circle c = new Circle(center, rad);
        System.out.println("Radius:" + c.getRadius());
        System.out.println("Center: (" + c.getCenter().x + "," + c.getCenter().y + ")");
        System.out.println("Area of circle: " + c.area());
        System.out.println("Enter a point(x y) to check if it is inside the circle");
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println(c.contains(new Point(x, y)));
        System.out.println("\nDetails:");
        c.printDetails();

        System.out.print("Rectangle:\nTopLeftCorner(x y): ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point topLeftCorner = new Point(x, y);
        System.out.print("Width:");
        double width = sc.nextDouble();
        System.out.print("Height:");
        double height = sc.nextDouble();
        Rectangle r = new Rectangle(topLeftCorner, height, width);

        System.out.println("Height:" + r.getHeight());
        System.out.println("Width: " + r.getWidth());
        System.out.println("TopLeftCorner: (" + r.getTopLeftCorner().x + "," + r.getTopLeftCorner().y + ")");
        System.out.println("Area: " + r.area());

        System.out.println("Enter a point(x y) to check if it is inside the rectangle");
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println(r.contains(new Point(x, y)));

        System.out.println("\nDetails:");
        r.printDetails();
    }
}
