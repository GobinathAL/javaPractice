public class Circle extends Region{
    Point center;
    Double radius;

    public Circle(Point center, Double radius) {
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
    double area() {
        return 3.14 * radius * radius;
    }
    @Override
    boolean contains(Point p) {
        boolean ans = ((p.x - center.x) * (p.x - center.x) + (p.y - center.y) * (p.y - center.y)) < (radius * radius);
        return ans;
    }
    @Override
    void printDetails() {
        System.out.println("Name: " + name + "Area: " + this.area());
    }
}
