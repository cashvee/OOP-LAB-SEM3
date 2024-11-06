import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Initialize counters
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Prompt user to enter 10 numbers
        System.out.println("Enter 10 numbers:");

        // Loop to read 10 numbers
        for (int i = 0; i < 10; i++) {
            // Read the number from user
            int number = scanner.nextInt();

            // Classify the number and update counters
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Close the scanner
        scanner.close();

        // Display the results
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
