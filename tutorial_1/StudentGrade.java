import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        
        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
        
        scanner.close();
    }
}