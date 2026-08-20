public class Lecturer extends Employee {
    private String subject;

    // Constructor
    public Lecturer(String id, String name, String subject, String department) {
        super(id, name, department); // Calls the parent (Employee) constructor
        this.subject = subject;
    }

    // Method to display lecturer specific information
    public void displaySubject() {
        System.out.println("Subject     : " + this.subject);
        System.out.println("Department  : " + this.department);
    }
}