public class Main {
    public static void main(String[] args) {
        // Create a Lecturer object with the specified sample data
        Lecturer lecturer = new Lecturer(
            "L100", 
            "Dr Ahmad", 
            "Java Programming", 
            "Faculty of Information Technology"
        );

        // Display the output
        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}