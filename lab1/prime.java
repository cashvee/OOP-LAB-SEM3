import java.util.Scanner; 
//import java.util.Math;
public class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not"); 
        int a=sc.nextInt(); 
        int count=0;
        
        for(int i=2; i<=9; i++)
        {
            if((a%i)==0)
            {count++; }

            else
           {count=0;}
        }

        if(count>0)
        {
            System.out.println("It is not a prime number"); 
        }
        else 
        System.out.println("It is a prime number"); 
      double b=Math.sqrt(a); 
      System.out.println("sqr root:" +b); 
      double c=Math.cbrt(a); 
      System.out.println("cube root" +c); 

    }
}