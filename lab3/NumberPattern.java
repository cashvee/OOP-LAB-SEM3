public class NumberPattern {
    public static void main(String[] args) {
        int number = 1;  // Start from 1
        
        // Outer loop for rows
        for (int row = 1; row <= 4; row++) {
            // Inner loop for numbers in each row
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");  // Print the number with a space
                number++;  // Increment the number
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
