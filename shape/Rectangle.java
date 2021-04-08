public class Rectangle extends Region {
    Point topLeftCorner;
    double height, width;

    public Rectangle(Point topLeftCorner, double height, double width) {
        this.name = "Rectangle";
        this.topLeftCorner = new Point(topLeftCorner.x, topLeftCorner.y);
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public boolean contains(Point p) {
        Point topRightCorner, bottomLeftCorner;
        topRightCorner = new Point(topLeftCorner.x + width, topLeftCorner.y);
        bottomLeftCorner = new Point(topLeftCorner.x, topLeftCorner.y - height);

        if (p.x > topLeftCorner.x && p.x < topRightCorner.x && p.y > bottomLeftCorner.y && p.y < topLeftCorner.y) {
            return true;
        } else
            return false;
    }

    @Override
    public void printDetails() {
        System.out.println("Name:" + name + " Area: " + this.area());

    }
}
