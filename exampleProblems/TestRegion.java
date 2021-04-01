public class TestRegion {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        Circle c = new Circle(center, 3.0);
        System.out.println(c.area());
        System.out.println(c.contains(new Point(1, 2)));
    }
}
