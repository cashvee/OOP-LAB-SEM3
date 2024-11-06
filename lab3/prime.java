/* . Write a Java program to generate prime numbers between n and m.(Hint: A prime 
number is a natural number greater than 1 that has no positive divisors other than 
1 and itself. Eg: 2, 3, 5,7,11 etc.) */

import java.util.*; 
public class prime 
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in); 
     int n, m, i, j;
     
     
     System.out.println("Generating prime numbers between two numbers.\n");
     System.out.println("Enter the range of numbers"); 
     n=sc.nextInt();
     System.out.print("to "); 
     m=sc.nextInt(); 
     
     for(i=n; i<m; i++)
     {
        int c=0;
        for(j=1; j<=i; j++)
        {
            if(i%j==0)
            c++; 
        }

        if(c==2)
        System.out.println(--j+" ");
     }
   }
}


