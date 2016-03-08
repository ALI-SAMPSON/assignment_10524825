import java.util.Scanner;
public class Example21 {
    public static void main(String [] ars)
    {
        Scanner input = new Scanner(System.in);
        int age = 16;
        String myname;
        
        System.out.println("Your name:");
        myname = input.nextLine();
        
        System.out.println("\nYour age: ");;
        age = input.nextInt();
        
        if(age < 16 && age != 10)
        {
            System.out.println(" You can't drive, "  + myname + "." );
        }
        
        else if(age <= 17 && age !=18 )
        {
            System.out.println("You can drive but not vote, "  + myname + ".");
        }
        
        else if(age < 25 && age !=25)
        {
          System.out.println("You can vote but can't rent a car, "  + myname + ".");   
        }
        
        if(age >= 25 && age <=60 )
        {
         System.out.println("You can do pretty much anything,"  + myname + "." );   
        }
        
        else
        {
            System.out.println("    ");
        }
        
    }
}
