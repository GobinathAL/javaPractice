import java.util.Scanner;
class File {
    protected String name, itemType, path, owner;
    protected int size;
    public File(String name, String itemType, String path, String owner, int size) {
        this.name = name;
        this.itemType = itemType;
        this.path = path;
        this.owner = owner;
        this.size = size;
    }
    public int getSize() {
        return this.size;
    }
}
class PNG extends File {
    private int width, height;
    public PNG(String name, String path, String owner, int size, int width, int height) {
        super(name, "PNG", path, owner, size);
        this.width = width;
        this.height = height;
    }
    public String getDimension() {
        String s = this.width + " x " + this.height;
        return s;
    }
    public void dispProperties() {
        System.out.println("Name: " + name + "\nItem Type: " + itemType + "\nPath: " + path + "\nOwner: " + owner + "\nSize: " + size + "\nDimension: " + this.getDimension());
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, path, owner;
        int size, width, height;
        System.out.printf("Name: ");
        name = sc.next();
        System.out.printf("File path: ");
        path = sc.next();
        System.out.printf("Owner: ");
        owner = sc.next();
        System.out.printf("File size: ");
        size = sc.nextInt();
        System.out.printf("Width: ");
        width = sc.nextInt();
        System.out.printf("Height: ");
        height = sc.nextInt();

        PNG obj1 = new PNG(name, path, owner, size, width, height);
        obj1.dispProperties();
    }
}
