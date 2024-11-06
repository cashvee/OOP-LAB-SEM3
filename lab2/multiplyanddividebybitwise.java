/*Write a Java program to multiply and divide a number by 2 using bitwise operator.
[Hint: use left shift and right shift bitwise operators]*/

import java.util.Scanner; 

public class multiplyanddividebybitwise{
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in); 

System.out.println("Enter a number: ");
int a=sc.nextInt(); 

int mu=a<<1; 
System.out.println("On multiplying by 2: "+mu);

int di=a>>1; 
System.out.println("On dividing by 2: "+di);
      sc.close();  
        
    }
}
