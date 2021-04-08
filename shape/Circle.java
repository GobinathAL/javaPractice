public class Circle extends Region {
    Point center;
    Double radius;

    public Circle(Point center, Double radius) {
        this.name = "Circle";
        this.center = new Point(center.x, center.y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public boolean contains(Point p) {
        boolean ans = ((p.x - center.x) * (p.x - center.x) + (p.y - center.y) * (p.y - center.y)) <= (radius * radius);
        return ans;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + " Area: " + this.area());
    }
}
