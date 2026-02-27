import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> students = new Vector<>();

        while (scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            if (choice == 1) {
                String name = scanner.next();
                students.add(name);
                System.out.println("Added");
            } else if (choice == 2) {
                String name = scanner.next();
                int index = scanner.nextInt();
                if (index >= 1 && index <= students.size() + 1) {
                    students.add(index - 1, name);
                    System.out.println("Inserted");
                }
            } else if (choice == 3) {
                String name = scanner.next();
                students.remove(name);
                System.out.println("Removed");
            } else if (choice == 4) {
                System.out.println(students);
            } else if (choice == 5) {
                break;
            }
        }
        
        scanner.close();
    }
}
