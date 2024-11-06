import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    // Constructor to initialize complex number
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Overloaded method to add an integer to a complex number
    public Complex add(int number) {
        return new Complex(this.real + number, this.imaginary);
    }

    // Overloaded method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting input for the first complex number
        System.out.println("Enter real and imaginary parts of the first complex number:");
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);

        // Getting input for the second complex number
        System.out.println("Enter real and imaginary parts of the second complex number:");
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        Complex c2 = new Complex(real2, imaginary2);

        // Getting input for the integer to add to the complex number
        System.out.println("Enter an integer to add to the first complex number:");
        int number = sc.nextInt();

        // Adding an integer to a complex number
        Complex result1 = c1.add(number);
        System.out.print("Result of adding integer to the complex number: ");
        result1.display();

        // Adding two complex numbers
        Complex result2 = c1.add(c2);
        System.out.print("Result of adding two complex numbers: ");
        result2.display();

        sc.close();
    }
}
