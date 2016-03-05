import java.util.Scanner;
public class Example3 {
    public static void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
         
        String name;
        int age;
        double income;
        
        System.out.println(" Please first of all enter your name ");
        name = inp.nextLine();
        
 
        System.out.println(" Hi " + name + ", how old are you please? ");
        age = inp.nextInt();
        
        System.out.println(" So you are " + age + ", then you are not old at all ");
        System.out.println(" ------------------------------------------ ");
        
        System.out.println(" By the way, how much do earn per month? ");
        income = inp.nextDouble();
        
        System.out.println( income + ", I think you must be working at Bank of Ghana ");
    }
}
