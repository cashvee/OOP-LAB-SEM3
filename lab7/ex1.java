
public class ex1 
{
    static class X
    { 
        static String  str="Inside Class X"; 
    } 
    public static void main(String args[]) 
    { 
        X.str= "Inside Class ex1"; 
        System.out.println("String stored in str is-"+ X.str); 
    }
}
