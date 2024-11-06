import java.util.Scanner; 

public class area
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); 
System.out.println("Enter length");
int l=sc.nextInt(); 

System.out.println("Enter breadth");
int b=sc.nextInt(); 

int area=l*b; 
int cir=2*(l+b);
System.out.println("Area is:"+area);
System.out.println("Circumference is:"+cir);
}}