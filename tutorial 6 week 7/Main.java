public class Main {
    public static void main(String[] args) {
        // Create and test the Washing Machine
        Appliance lgWasher = new WashingMachine("LG");
        lgWasher.displayBrand();
        lgWasher.turnOn();
        lgWasher.operate();
        lgWasher.turnOff();

        System.out.println(); // Prints a blank line for separation

        // Create and test the Refrigerator
        Appliance panasonicFridge = new Refrigerator("Panasonic");
        panasonicFridge.displayBrand();
        panasonicFridge.turnOn();
        panasonicFridge.operate();
        panasonicFridge.turnOff();
    }
}