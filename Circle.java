/*
Create the following class AreaOfCircle which has Attributes – Radius, area, perimeter and
Methods - getRadius(), findArea(), findPerimeter(). getRadius() should get user input as radius.
findArea() returns area of the circle. findPerimeter() returns perimeter of the circle. Create 2
objects and compare the areas of the objects.
*/
import java.util.Scanner;

class AreaOfCircle {
    private double radius, area, perimeter;

    public void getRadius() {
        Scanner sc = new Scanner(System.in);
        this.radius = sc.nextFloat();
    }
    public double findArea() {
        this.area = Math.PI * this.radius * this.radius;
        return this.area;
    }
    public double findPerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
        return this.perimeter;
    }
}
public class Circle {
    public static void main(String[] args) {
        AreaOfCircle circle1 = new AreaOfCircle();
        AreaOfCircle circle2 = new AreaOfCircle();

        System.out.println("Enter radius of circle 1");
        circle1.getRadius();
        System.out.println("Enter radius of circle 2");
        circle2.getRadius();
        double area1 = circle1.findArea();
        double area2 = circle2.findArea();
        double perimeter1 = circle1.findPerimeter();
        double perimeter2 = circle2.findPerimeter();
        System.out.printf("\nCircle 1:\nArea - %f\nPerimeter - %f\n", area1, perimeter1);
        System.out.printf("\nCircle 2:\nArea - %f\nPerimeter - %f\n\n", area2, perimeter2);
        if(area1 > area2)
            System.out.println("Circle 1 has greater area");
        else if(area2 > area1)
            System.out.println("Circle 2 has greater area");
        else 
            System.out.println("Both circles have equal area");
    }
}
