import java.util.Scanner; 

public class ten
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
System.out.println("Sorting 10 numbers as positive negative or zero"); 
System.out.println("Enter 10 numbers:"); 

int i;
int num[] = new int[10]; 
for(i=0; i<10; i++)
{
num[i]=sc.nextInt();
}
int ncount=0; 
int pcount=0; 
int zerocount=0;

for(i=0; i<10; i++)
{
if(num[i]<0)
{
System.out.println("negative: " +num[i]); 
ncount++; 
}

if(num[i]>0)
{
System.out.println("positive: " +num[i]); 
pcount++;
}

if(num[i]==0)
{System.out.println("this is 0: " +num[i]); 
 zerocount++; 
}}

System.out.println("Count of negative numbers:"+ncount);
System.out.println("Count of positive numbers:"+pcount);
System.out.println("Count of 'zero' numbers:"+zerocount);
}
}