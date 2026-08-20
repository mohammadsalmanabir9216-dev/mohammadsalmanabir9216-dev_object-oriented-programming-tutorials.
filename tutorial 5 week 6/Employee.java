public class Employee {
    protected String id;
    protected String name;
    protected String department; // Added as per Activity 2.1

    // Constructor
    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
    }
}