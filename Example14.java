import java.util.Scanner;
public class Example14 {
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        char response;
        int opt , option;
        
        
        System.out.println("Are you ready for a Quiz?");
        System.out.println("Enter Y for NO or N for No");
        response  = enter.next().charAt(0);
        
        if(response == 'N')
        {
            System.out.println("Okay, Then you can leave and come another time!");
        }
        else if(response == 'Y')
        {
             System.out.println(" Okay, here it comes!\n");
             
             System.out.println(" Q1) What is the capital of Alaska?\n");
             System.out.println("      1) Melbourne");
             System.out.println("      2) Anchorage");
             System.out.println("      3) Juneau");
             
             opt = enter.nextInt();
             if(opt  == 1)
             {
                 System.out.println("You are wrong!\n");
             }
             else if(opt == 2)
             {
                System.out.println("You are wrong!\n");
             }
             else if (opt == 3)
             {
               System.out.println("That's right!\n");
             }
             else
             {
                 System.out.println("      ");  
             }
             
             
        }
             System.out.println(" Q1) Can you store the value cat in a variable of type int?");
             System.out.println("      1) Yes");
             System.out.println("      2) No\n");
             option = enter.nextInt();
             if( option == 1)
             {
                 System.out.println("Sorry, cat is a string. ints can only store numbers\n");      
             }
             else if(option == 2)
             {
                System.out.println("Wow, that's great! You are correct..\n");
             }
             else
             {
                 System.out.println("      ");
             }
        
             System.out.println("What is the result of 9+6/3");
             System.out.println("      1) 5    ");
             System.out.println("      2) 11   ");
             System.out.println("      3) 15/3 \n");
             opt = enter.nextInt();
             if(opt == 1)
             {
                 System.out.println("\nSorry, That's not correct!");
             }
             else if(opt == 2)
             {
                 System.out.println("\nThat's correct!");
             }
             else if(opt == 3)
             {
                 System.out.println("\nSorry, That's not correct!");
             }
             
                 System.out.println("\nOverall, you got 2 out of 3 correct.\nThanks for playing");
            }
}
