import java.util.Scanner;
class Phone {
    String brand, model;
    double price;
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    class Processor {
        int cores;
        String manufacturer;
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        public void disp() {
            System.out.println("No of Cores: " + cores + "\nManufacturer: " + manufacturer);
        }
    }
    class RAM {
        int memory;
        String manufacturer;
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        public void disp() {
            System.out.println("Memory: " + memory + "\nManufacturer: " + manufacturer);
        }
    }
    public void disp() {
        System.out.println("Phone: " + brand + " " + model + "\nPrice: " + price);
    }
}
public class NestedClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Brand: ");
        String brand = sc.next();
        System.out.printf("Model: ");
        String model = sc.next();
        System.out.printf("Price: ");
        double price = sc.nextDouble();
        Phone ph1 = new Phone(brand, model, price);
        System.out.printf("Processor\nManufacturer: ");
        String manufacturer = sc.next();
        System.out.printf("No of cores: ");
        int cores = sc.nextInt();
        Phone.Processor pr1 = ph1.new Processor(cores, manufacturer);
        System.out.printf("RAM\nMemory(in GB): ");
        int memory = sc.nextInt();
        System.out.printf("Manufacturer: ");
        manufacturer = sc.next();
        Phone.RAM r1 = ph1.new RAM(memory, manufacturer);
        System.out.println();
        ph1.disp();
        System.out.println("\nProcessor");
        pr1.disp();
        System.out.println("\nRAM");
        r1.disp();
    }
}
