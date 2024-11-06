/* Write a java program to store student record of college named MIT. 
Class Student_Detail should contain name, id, college_name as members.
display_details method should display the details of the students.
*/

import java.util.*;
public class college {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students in MIT");
        Student_Detail MIT[] = new Student_Detail[sc.nextInt()];

        for(int i = 0; i<MIT.length;i++){
            sc.nextLine();
            System.out.println("Enter the name of the student:");
            String name = sc.nextLine();
            System.out.println("Enter the id of student:");
            MIT[i] = new Student_Detail(name, sc.nextInt(), "MIT");
        }
        System.out.println("\nStudents:");
        for(Student_Detail p : MIT){
            p.display_details();
        }
        sc.close();
    }
}
class Student_Detail{
    String name;
    int id;
    String collegeName;

    void display_details()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: " + id);
        System.out.println("College Name: \n" + collegeName);
       
    }
    Student_Detail(String name, int id, String collegeName){
        this.name = name;
        this.id = id;
        this.collegeName = collegeName;
    }
}