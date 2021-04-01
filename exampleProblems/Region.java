abstract class Region {
    String name;
    abstract boolean contains(Point p);
    double area() {
        return 0;
    }
    abstract void printDetails();
}
