public class Main {
    public static void main(String[] args) {
        // Creating instances of Person, Student, and Lecturer
        Person p0 = new Person("Generic Name", "000");
        Person p1 = new Student("Alex", "S123");
        Person p2 = new Lecturer("Dr. Smith", "L456");

        // Calling the introduce method on each object
        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}