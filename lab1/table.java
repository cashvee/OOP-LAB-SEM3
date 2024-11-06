//Program to print table of number entered by user

import java.util.Scanner; 

public class table 
{ 
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter number for multiplication: ");
    int n=sc.nextInt(); 

    for(int i=1; i<=10; i++)
    {
        System.out.println(n+"*"+i+"="+(n*i)); 
    }
}}

