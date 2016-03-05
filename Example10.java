
public class Example10 {
    public static void main(String[]args)
    {
        int people  = 30;
        int cars = 40;
        int buses = 15;
        
        if(cars > people)
        {
            System.out.println("We should take the cars.");
        }
        
       else if(cars < people)
        {
            System.out.println("We should not take the cars.");
        }
        else
        {
         System.out.println("We can't decide.");
        }
        
        
        if(buses > cars)
        {
         System.out.println("That's too many buses.");
        }
        else if(buses < cars)
        {
         System.out.println("Maybe we could take the buses.");   
        }
        else
        {
            System.out.println("We can't still decide."); 
        }
        
        
        if(people > buses)
        {
            System.out.println("All right, let's just take the buses.");
        }
        else
        {
            System.out.println("Fine, let's stay home then.");
        }
        
        /*the else if and else in the program are helping to 
        create more room for testing more conditions and 
        executing diffferent statements for the program*/
        
        /*when one of the else part of the else if statement is removed,
        it doesn't affect the execution of the program but reduces the
        number of test conditions to be executed*/  
    }
    
}
