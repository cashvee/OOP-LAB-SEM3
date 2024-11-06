/*
Java program to find the result of the following expressions for various 
values of a & b: 
a. (a << 2) + (b >> 2) 
b. (b > 0) 
c. (a + b * 100) / 10 
d. a & b 
*/

import java.util.Scanner;

public class BitwiseOp
{//Start of class
    public static void main(String args[])
    {//Start of main function

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter a value for b: ");
        int b = sc.nextInt();

        int c = (a<<2) + (b>>2);
        boolean d = (b>0);
        int e = (a+b*100)/10;
        int f = a&b;

        System.out.println("(a<<2) + (b>>2) = "+c);
        System.out.println("(b>0) = "+d);
        System.out.println("(a+b*100)/10 = "+e);
        System.out.println("a & b = "+f);

        sc.close();
    }//End of main function
}//End of class