import java.util.*;

interface Sales {
    double getSales3Months(); // No parameters
}

public class hardwareSoftware {
    static Scanner sc = new Scanner(System.in); // Single Scanner instance used throughout

    public static void main(String[] args) 
    {   
        System.out.println("Enter the details for hardware:");
        Hardware h1 = new Hardware(sc.nextLine(), sc.nextLine());
        System.out.println("The sales for three months is: " + h1.getSales3Months());

        System.out.println("Enter the details for software:");
        Software s1 = new Software(sc.nextLine(), sc.nextLine());
        System.out.println("The sales for the three months is: " + s1.getSales3Months());

        sc.close(); // Close the scanner only once, at the end
    }
}

class Hardware implements Sales {
    String category;
    String manufacturer;

    Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
    }

    @Override
    public double getSales3Months() {
        System.out.println("Enter the sales for past three months:");
        return hardwareSoftware.sc.nextDouble(); // Use the shared Scanner instance
    }
}

class Software implements Sales {
    String OS;
    String typeOfSoftware;

    Software(String OS, String typeOfSoftware) {
        this.OS = OS;
        this.typeOfSoftware = typeOfSoftware;
    }

    @Override
    public double getSales3Months() {
        System.out.println("How much did software sell?");
        return hardwareSoftware.sc.nextDouble() * 3; // Use the shared Scanner instance
    }
}
