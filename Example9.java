<<<<<<< HEAD
import java.util.Scanner;
public class Example9 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String yourname;
        int years = 16;
        
        System.out.println("Hey, what's your name?");
        yourname = input.nextLine();
        
        System.out.println("Ok, " + yourname + ", how old are you please? ");
        years  = input.nextInt();
        
        if(years < 16)
        {
            System.out.println("You can't drive.");
        }
        
        if(years < 18)
        {
         System.out.println("You can't vote.");   
        }
        
        if(years < 25)
        {
         System.out.println("You can't rent a car.");   
        }
    }
    
}
=======
import java.util.Scanner;
public class Example9 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String yourname;
        int years = 16;
        
        System.out.println("Hey, what's your name?");
        yourname = input.nextLine();
        
        System.out.println("Ok, " + yourname + ", how old are you please? ");
        years  = input.nextInt();
        
        if(years < 16)
        {
            System.out.println("You can't drive.");
        }
        
        if(years < 18)
        {
         System.out.println("You can't vote.");   
        }
        
        if(years < 25)
        {
         System.out.println("You can't rent a car.");   
        }
    }
    
}
>>>>>>> 9aa901697f8b2b9364b7d06d3ed6430d8ad3b88c
