/*
 Write a Java program to execute the following statements. Observe and analyze 
the outputs 
a.  boolean x =true; 
    int y = x; 
b.  boolean x =true;
    int y =(int)x;
 */

 import java.util.Scanner;

   public class Output2
   { Start of class
      public static void main(String args[])
      { //Start of main function
          Scanner sc = new Scanner(System.in);
          boolean x1 = true;
          int y1 = x1;
          //boolean x2 = true;
          //int y2 = (int)x2;
          System.out.println("y1 = "+y1);
          //System.out.println("y2 = "+y2);

          sc.close();
      } //End of main function
   }//End of class