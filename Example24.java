import java.util.Scanner;
public class Example24 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        char gend,reply;
        String fname,sname;
        int age;
        
        System.out.print("What is your gender (M or F)");
        gend = input.next().charAt(0);
        
        System.out.println("First name: ");
        fname = input.nextLine();
        
        System.out.println("Last name: ");
        sname = input.nextLine();
        
        System.out.print("Age: ");
        age = input.nextInt();
        
        if ( gend == 'F' && age >= 20)
        {
             System.out.print("Are you married please (y or n)?");
             reply =input.next().charAt(0);
             
              if(reply == 'y')
             {
               System.out.println("Then I shall call you Mrs " + fname + sname);   
             }
              else
              {
               System.out.println("Then I shall call you Ms " + fname + sname);
              }
            
        }
        else if ( gend == 'F' && age < 20)
        {
            System.out.println("Then I shall call you " + fname + sname);            
        }
        else
        {
             System.out.println("               "); 
        }
        
         if ( gend == 'M' && age >= 20)
        {
             System.out.print("Are you married please (y or n)?");
             reply =input.next().charAt(0);
             
              if(reply == 'y')
             {
               System.out.println("Then I shall call you Mr " + fname + sname);   
             }
              else
              {
               System.out.println("Then I shall call you " + fname + sname);
              }
        }
       
    }
}
