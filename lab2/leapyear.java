import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
         {
            System.out.println("It is a leapyear");
        }

        else {
            System.out.println("It is not a leapyear");
        }
    }
}
