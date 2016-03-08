import java.util.Scanner;
public class Example22 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        String plant,response;
        int flawa = 3;
        
        System.out.println("TWO MORE QUESTIONS, BABY!\n");
        
        System.out.println("Think of something and I'll try to guess it!\n");
        
        System.out.println("Question 1) Does it stay inside or outside or both!?");
        response = input.nextLine();
        
        if(response == "outside" || response == "Outside" || response == "OOUTSIDE" && response == "inside" || response == "Inside" || response == "INSIDE" )
        {
        System.out.println("Question 2) Is it a livingthing?");
        plant = input.nextLine();
         if (plant == "yes" || plant =="Yes" || plant == "YES") 
         {
        System.out.println("Then what else could you be thinking of besides a python?!?");
         }
        }
        
        if(response == "both" || response =="Both" || response =="BOTH" )
        {
        System.out.println("Question 1) Does it stay inside or outside or both!?");
        response = input.nextLine();
        
        System.out.println("Question 2) Is it a livingthing?");
        plant = input.nextLine();
          if (plant == "no" || plant == "No" || plant == "NO")
          {
              System.out.println("Obviously the nonliving, inside/outside thing on your mind is a dead animal");
          }
        }
        
    }
}
