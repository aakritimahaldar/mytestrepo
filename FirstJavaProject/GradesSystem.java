import java.util.*;
public class GradesSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the first value: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third value: ");
        double c = scanner.nextDouble();

        // Sum and average
        double sum = a + b + c;
        double average = sum / 3;

        // Assign grade based on average
        char grade;
        if (average > 90) {
            grade = 'A';
        } 
        else if (average >= 80) {
            grade = 'B';
        } 
        else if (average >= 70) {
            grade = 'C';
        } 
        else {
            grade = 'D';
        }

        // Result
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
