import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of grades
        System.out.print("Enter the number of grades: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid number of grades!");
            return;
        }

        double[] grades = new double[n];
        double sum = 0;

        // Input grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Calculate average
        double average = sum / n;

        // Display result
        System.out.println("\nAverage Grade: " + average);

        scanner.close();
    }
}