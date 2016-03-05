import java.util.Scanner;
public class Example12 {
    public static void main(String[]args)
    {
        Scanner type = new Scanner(System.in);
        int age = 16;
        String myname;
        
        System.out.println("Yoo, what's your name?");
        myname = type.nextLine();
        
        System.out.println("\nOk, " + myname + ", how old are you ");
        age = type.nextInt();
        
        if(age < 16)
        {
            System.out.println("You can't drive, " + myname +"." );
        }
        else if(age <= 17)
        {
            System.out.println("You can drive but you can't vote, " + myname +".");
        }
        else if(age < 25 )
        {
          System.out.println("You can vote but not rent a car, " + myname +".");   
        }
        if(age >= 25)
        {
         System.out.println("You can do pretty much anything, " + myname + "." );   
        }
        else
        {
            System.out.println("    ");
        }
    }
}
