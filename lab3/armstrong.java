/*Armstrong number is a number that is equal to the
sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 
407 are the Armstrong numbers.*/

import java.util.*;
public class armstrong 
{
    public static void main(String[] args)
    {
        int num, n, rem,newnum=0; 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Program to check if a number is an armstrong number"); 
        System.out.println("Enter number: ");
        num=sc.nextInt(); 
        n=num;
        
       do{
        rem=n%10;
        n=n/10; 
        newnum=newnum+(rem*rem*rem);
       } while(n>0);

       if(num==newnum)
       {
        System.out.println("The number " +num+ " is an armstrong number.");
       }

       else 
       {System.out.println("The number " +num+ " is not an armstrong number.");}
    sc.close();
    }
}
