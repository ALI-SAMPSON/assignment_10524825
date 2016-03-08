import java.util.Scanner;
public class Example27 {
    public static void main(String[]ars)
    {
        Scanner input = new Scanner(System.in);
        int var,fig;
        
        System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!!1! \n");
        
        System.out.print("I'M THINKING OF A NUMBER FROM 1 - 10.  TRY 2 GUESS!\n" );
        fig = input.nextInt();
        if(fig == 3 )
        {
          var = 3 + 1;
          System.out.println("WOOT!  U SUXOR!!! I PWN JOO!!! IT WAS " + var+"!");     
        }
        else if(fig == 4)
        {
          var = 3 + 1;
          System.out.println("LOL!!! U GOT IT! I CAN'T BELIEVE U GUESSED IT WAS " + var +"!");
        }
        else
        {
            System.out.println("            ");
        }
    }
}
