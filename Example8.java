
public class Example8 {
    public static void main(String [] args)
    {
        int people = 30;
        int cats = 30;
        int dogs = 15;
        
        if (people < cats)
        {
                    System.out.println("Too many cats!  The world is doomed!");
        }
        
        if(people > cats)
        {
            System.out.println("Not many cats!  The world saved!");
        }
        
        if( people < dogs )
        {
            System.out.println("The world is drooled on!");
        }
        
        if( people > dogs )
        {
            System.out.println("The world is dry!");
        }
        
        dogs += 5;
        
        if(people >= dogs)
        {
            System.out.println("People are greater or equal to dogs");
        }
        
        if( people <= dogs )
        {
            System.out.println("People are less than or equal to dogs.");
        }
        
        if(people == dogs)
        {
            System.out.println("People are dogs");
        }
        /*the if-statement tests a condition to see if it is true or not
        and executes the statements in the block according to the condition given*/
        
        /*The curly braces in the if-statement helps in the  execution of the 
        statements in the block of the if-statement and it also helps to classify 
        all whats between the curly braces as statements to be executed */ 
    }
    
}
