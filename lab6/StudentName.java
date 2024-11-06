/*Create a base class for student having registration number, name and age. From this
class create two new class UG and PG student with semester and fees as its data
members. Use proper member function for demonstrating inheritance. Display the
details of students who took admission to UG course and PG course separately, total
number of UG admissions and PG admissions.*/

import java.util.Scanner;

class Student {
    int regno;
    String name;
    int age;

    // Constructor for Student class
    Student(int regno, String name, int age) {
        this.regno = regno;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Registration Number: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UG extends Student {
    int semester;
    double fees;

    // Constructor for UG class
    UG(int regno, String name, int age, int semester, double fees) {
        super(regno, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    // Method to display UG student details
    void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

class PG extends Student {
    int semester;
    double fees;

    // Constructor for PG class
    PG(int regno, String name, int age, int semester, double fees) {
        super(regno, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    // Method to display PG student details
    void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

public class StudentName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // To store UG and PG students
        UG[] ugStudents = new UG[10]; // Adjust size as needed
        PG[] pgStudents = new PG[10]; // Adjust size as needed
        int ugCount = 0;
        int pgCount = 0;

        while (true) {
            System.out.println("Enter student type (1 for UG, 2 for PG, 0 to exit): ");
            int studentType = sc.nextInt();
            // scanner.nextLine(); // Consume newline

            if (studentType == 0) {
                break;
            }

            System.out.println("Enter Registration Number: ");
            int regno = sc.nextInt();

            System.out.println("Enter Name: ");
            String name = sc.next/* Line */();
            // sc.nextLine();

            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            System.out.println("Enter Semester: ");
            int semester = sc.nextInt();

            System.out.println("Enter Fees: ");
            double fees = sc.nextDouble();

            if (studentType == 1) {
                // Create UG student and add to array
                ugStudents[ugCount++] = new UG(regno, name, age, semester, fees);
            } else if (studentType == 2) {
                // Create PG student and add to array
                pgStudents[pgCount++] = new PG(regno, name, age, semester, fees);
            } else {
                System.out.println("Invalid");
            }
        }

        // Display UG students details
        System.out.println("\nUndergraduate Students:");
        for (int i = 0; i < ugCount; i++) {
            ugStudents[i].displayDetails();
            System.out.println();
        }

        // Display PG students details
        System.out.println("Postgraduate Students:");
        for (int i = 0; i < pgCount; i++) {
            pgStudents[i].displayDetails();
            System.out.println();
        }

        // Display counts
        System.out.println("Total number of UG admissions: " + ugCount);
        System.out.println("Total number of PG admissions: " + pgCount);

        sc.close();
    }
}
