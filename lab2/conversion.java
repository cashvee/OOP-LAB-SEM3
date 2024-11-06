/*Write a Java program to read an int number, double number and a char from keyboard 
and perform the following conversions:- int to byte, char to int, double to byte, double 
to int*/ 

import java.util.Scanner; 

public class conversion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter an int number: ");
        int i=sc.nextInt(); 
        System.out.println("You entered an int number: "+i);

        System.out.println("Enter a double number: ");
        double d=sc.nextDouble(); 
        System.out.println("You entered double number: "+d);

        System.out.println("Enter a character: ");
        char c=sc.next().charAt(0); 
        System.out.println("You entered character: "+c);

      byte b1=(byte)i; 
      System.out.println("The integer i("+i +") when converted to byte is "+b1);
    
      int ch=(int)c; 
      System.out.println("The character c("+c +") when converted to integer is "+ch);

      byte b2=(byte)d;
      System.out.println("The double number("+d +") when converted to byte is "+b2);

      int i2=(int)d; 
      System.out.println("The integer i("+i +") when converted to double is "+i2);
      sc.close();
    }
}