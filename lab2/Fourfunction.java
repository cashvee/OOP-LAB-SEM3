/*Create the equivalent of a four-function calculator. The program should request the user to enter a number,
 an operator, and another number. (Use floating point).

It should then carry out the specified arithmetic operation: adding, subtracting, multiplying,
 or dividing the two numbers. 
Use a switch statement to select the operation. 
Finally, display the result. 

When it finishes the calculation, the program should ask if the user wants to do another calculation. 
The response can be 'y' or 'n'. [Hint: use do-while loop]*/

import java.util.Scanner;
public class Fourfunction {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       char ans='y';
        do{
          
            float result; 
        System.out.println("Enter a number: ");
        float n1=sc.nextFloat();

        System.out.println("Enter the choice of operator (+, -, /, *): ");
        char c=sc.next().charAt(0); 

        System.out.println("Enter 2nd number: "); 
        float n2=sc.nextFloat();

        switch(c)
        {
            case '+':
            result = n1 + n2;
            break;

            case '-': 
            result = n1-n2; 
            break; 

            case '*': 
            result = n1*n2; 
            break;

            case '/':
            if (n2 != 0) {
                result = n1 / n2;
            }  

            else {
                System.out.println("Error: Division by zero is not allowed.");
                continue; 
            }
            break;

            default: 
            System.out.println("Error: Invalid operator.");
            continue;

        }
        System.out.println("The result is: " + result);  
        System.out.println("Do you want to perform another calculation? (y/n): ");
        ans=sc.next().charAt(0);
      
    }while (ans== 'y');

}}