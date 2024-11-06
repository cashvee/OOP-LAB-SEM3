import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        // Initialize the array at the time of declaration
        int[] a = {1, 2, 3, 1, 2, 1, 5, 6, 7};

        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the value to be searched
        System.out.print("Enter the value to search for: ");
        int searchValue = sc.nextInt();

        // Initialize a flag to check if the value is found
        boolean found = false;

        // Search for the value in the array using a for-each loop
        System.out.print("The value is found at locations: ");
        int index = 0;
        for(int element : a) {
            if (element == searchValue) {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print("a[" + index + "]");
                found = true;
            }
            index++;
        }

        // If the value is not found, print a message
        if (!found) {
            System.out.println("Value not found in the array.");
        }

        // Close the scanner
        sc.close();
    }
}
