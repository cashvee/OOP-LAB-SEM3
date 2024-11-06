/*
Java program to find largest and smallest among 3 numbers using ternary 
operator
 */

 import java.util.Scanner;

 public class Largest
 {//Start of class
    public static void main(String args[])
    {//Start of main function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number #1: ");
        int a = sc.nextInt();
        System.out.println("Enter number #2: ");
        int b = sc.nextInt();
        System.out.println("Enter number #3: ");
        int c = sc.nextInt();

        int l = (a>b ? (a>c ? a : c) : (b>c ? b : c));
        System.out.println("The largest number is = "+l);

        sc.close();
    }//End of main function
 }//End of class