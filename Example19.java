import java.util.Scanner;
public class Example19 {
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        String name;
        String ent;
        
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.\n");
       
        
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        name= enter.nextLine();
        
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.println("Please type yes or no for this question.\n");
        ent = enter.nextLine();
        
        if(name == "animal" && ent == "no")
        {
        System.out.println("My guess is that you are thinking of a mouse.");
        System.out.println("I would ask you if I'm  right, but I don't actually care.");
        }
        else if(name == "mineral" && ent == "yes" )
        {
        System.out.println("My guess is that you are thinking of a truck.");
        System.out.println("I would ask you if I'm  right, but I don't actually care.");
        }
        else if(name == "vegetable" && ent == "yes")
        {
        System.out.println("You're thinking of a pumkin.");
        System.out.println("I would ask you if I'm  right, but I don't actually care.");
        }
        else 
        {
                  System.out.println("             ");
        }
    }
    
}
