import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store the tasks
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // ACTIVITY (1): Add 3 tasks and display them
        // ==========================================
        System.out.println("====== ADD TASKS ======");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        System.out.println("\n====== TASK LIST ======");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // ==========================================
        // ACTIVITY (2): File Handling (Save & Load)
        // ==========================================
        String filename = "task.txt";

        // 2.1 Saving all tasks into task.txt
        try {
            FileWriter writer = new FileWriter(filename);
            for (String task : tasks) {
                writer.write(task + "\n");
            }
            writer.close();
            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving tasks: " + e.getMessage());
        }

        // 2.2 & 2.3 Reading and displaying the contents from task.txt
        System.out.println("\n====== TASKS LOADED FROM FILE ======");
        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String fileData = fileReader.nextLine();
                System.out.println(fileData);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while loading tasks: " + e.getMessage());
        }

        scanner.close();
    }
}