abstract class Region implements InterfaceRegion{
    String name;
    public abstract boolean contains(Point p);
    public abstract double area();
    public abstract void printDetails();
}
