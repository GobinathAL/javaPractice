import java.util.ArrayList;

class TV {
    protected String brand, model;
    protected double weight, displaySize;
    public TV(String brand, String model, double weight, double displaySize) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.displaySize = displaySize;
    }
    protected void switchON(){ 
        System.out.println("TV is Switched ON"); 
    }
    protected void changeChannel() { 
        System.out.println("Pick a TV Channel using remote"); 
    }
    protected void changeChannel(String s) { 
        System.out.println("Channel changed to " + s); 
    }
    protected void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight);
        System.out.println("Display Size: " + displaySize);
    }
}
class SmartTV extends TV {
    private String os;
    private ArrayList<String> ottApps;
    public SmartTV(String brand, String model, double weight, double displaySize, String os, ArrayList<String> ottApps) {
        super(brand, model, weight, displaySize);
        this.os = os;
        this.ottApps = new ArrayList<String>(ottApps);
    }
    @Override
    protected void switchON(){ 
        System.out.println("Smart TV is Switched ON"); 
    }
    @Override
    protected void changeChannel() { 
        System.out.println("Pick a TV Channel using remote or voice commands"); 
    }
    protected void browse(){ 
        System.out.println("Smart Tv Browsing"); 
    }
    @Override
    protected void displaySpecs() {
        super.displaySpecs();
        System.out.println("OS: " + os);
        System.out.println("Supported OTT Apps:");
        for(String ele : ottApps) {
            System.out.println(ele);
        }
    }
}
class LEDTV extends TV {
    private boolean isCurved;
    public LEDTV(String brand, String model, double weight, double displaySize, boolean isCurved) {
        super(brand, model, weight, displaySize);
        this.isCurved = isCurved;
    }
    @Override
    protected void displaySpecs() {
        super.displaySpecs();
        System.out.println("Curved Display: " + isCurved);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        TV t1 = new TV("LG", "C1", 15, 45);
        ArrayList<String> ottApps = new ArrayList<String>();
        ottApps.add("Netflix");
        ottApps.add("Amazon Prime");
        ottApps.add("Hulu");
        SmartTV t2 = new SmartTV("LG", "C2", 12, 75, "AndroidTV OS", ottApps);
        LEDTV t3 = new LEDTV("LG", "G1", 13, 35, true);
        t1.switchON();
        t1.changeChannel();
        t1.changeChannel("Fox News");
        t1.displaySpecs();
        System.out.println();

        t2.switchON();
        t2.changeChannel();
        t2.changeChannel("National Geographic");
        t2.browse();
        t2.displaySpecs();
        System.out.println();
        t3.changeChannel();
        t3.displaySpecs();
    }
    
}
