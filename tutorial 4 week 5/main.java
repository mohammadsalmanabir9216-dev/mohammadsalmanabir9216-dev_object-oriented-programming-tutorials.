public class main {
    public static void main(String[] args) {
        // Create an object of Student class
        Student s1 = new Student();

        // Assigning values using setters
        s1.setStudentID("CU12345");
        s1.setName("Ali");
        s1.setCGPA(3.75);

        // Printing values using getters to match expected output
        System.out.println("Student ID : " + s1.getStudentID());
        System.out.println("Name       : " + s1.getName());
        System.out.println("CGPA       : " + s1.getCGPA());
        System.out.println("Programme  : BIT");
    }
}