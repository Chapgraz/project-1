import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstname = "", lastname = "", course = "", section = "";
        int age = 0, studentId = 0;

        boolean isStudent = false;

        System.out.println("Are you a student? (yes/no) ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            isStudent = true;
        } else if (response.equalsIgnoreCase("no")) {
            isStudent = false;
        } else {
            System.out.println("Wrong Input!");
            scanner.close();
            return; // Exit early on invalid input
        }

        if (isStudent) {
            System.out.println("Student ID: ");
            studentId = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            System.out.println("First Name: ");
            firstname = scanner.nextLine();

            System.out.println("Last Name: ");
            lastname = scanner.nextLine();

            System.out.println("Age: ");
            age = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            System.out.println("Course: ");
            course = scanner.nextLine();

            System.out.println("Section: ");
            section = scanner.nextLine();

            System.out.println("\n--- STUDENT INFORMATION ---");
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + firstname + " " + lastname);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
            System.out.println("Section: " + section);
        } else {
            System.out.println("You are not enrolled here!");
        }

        scanner.close();
    }
}
