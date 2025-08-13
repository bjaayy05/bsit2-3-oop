import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Student Information
        System.out.println("=== Enter Student Information ===");

        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Section: ");
        String section = scanner.nextLine();

        // Display Student Information
        System.out.println("\n=== STUDENT INFORMATION ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        // Get Scores
        System.out.println("\n=== Enter Student Scores ===");

        System.out.print("Midterm Exam Score: ");
        int midtermExam = scanner.nextInt();

        System.out.print("Final Exam Score: ");
        int finalExam = scanner.nextInt();

        System.out.print("Project Score: ");
        int project = scanner.nextInt();

        System.out.print("Attendance Score: ");
        int attendance = scanner.nextInt();

        // Calculate total and average
        int total = midtermExam + finalExam + project + attendance;
        int average = total / 4;

        // Determine remarks
        String remarks = (average < 75) ? "FAILED" : "PASSED";

        // Display Scores and Remarks
        System.out.println("\n=== STUDENT SCORES ===");
        System.out.println("Midterm Exam: " + midtermExam);
        System.out.println("Final Exam: " + finalExam);
        System.out.println("Project: " + project);
        System.out.println("Attendance: " + attendance);
        System.out.println("-------------------------");
        System.out.println("Average: " + average);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
