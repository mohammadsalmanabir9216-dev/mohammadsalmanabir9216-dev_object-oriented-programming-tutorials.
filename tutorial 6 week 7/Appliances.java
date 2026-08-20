// Abstract base class
abstract class Appliance {
    protected String brand;

    // Constructor
    public Appliance(String brand) {
        this.brand = brand;
    }

    // Concrete methods shared by all appliances
    public void displayBrand() {
        System.out.println("Brand: " + this.brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    // Abstract method to be implemented by subclasses
    public abstract void operate();
}

// Subclass 1: Washing Machine
class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

// Subclass 2: Refrigerator
class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Store food & beverages...");
    }
}