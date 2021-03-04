import java.lang.*;
class Laptop {
    String brand, model;
    int ram, storage;
    boolean isCameraAvailable;
    public Laptop(String brand, String model,int ram, int storage, boolean isCameraAvailable) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.isCameraAvailable = isCameraAvailable;
    }
    public void printSpecs() {
        System.out.println("\nSpecs of " + brand + " " + model);
        System.out.println("Ram: " + ram + "\nStorage: " + storage);
        if(isCameraAvailable)
            System.out.println("Camera Available\n");
        else
            System.out.println("No Camera\n");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalized " + this);
    }
}

public class LaptopMain {
    public static void main(String[] args) throws Throwable {
        Laptop l1 = new Laptop("Hp", "Pavillion", 8, 512, true);
        Laptop l2 = new Laptop("Lenovo", "IdeaPad", 4, 256, false);

        l1.printSpecs();
        l2.printSpecs();
        System.gc();
        l1.printSpecs();
    }
}
