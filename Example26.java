import java.util.Scanner;
public class Example26 {
    public static void main(String[]args)
    {
     Scanner enter = new Scanner(System.in);
     String lname;
       
     
     System.out.println("What is your last name?");
     lname = enter.nextLine();
     
     int a = "Carswell".compareTo("Clenty");
     int b = "Jones".compareTo("Johnny");
     int c = "Smith".compareTo("Simpson");
     int d = "Young".compareTo("Yeboah");
     int e = "Young".compareTo("Yumatey");
     
     if(a < 0) 
     {
         System.out.println("You don't have to wait long, " + lname +".");
     }
     else if(b >= 0)
     {
         System.out.println("that's not bad, " + lname +".");
     }
     else if (c < 0)
     {
         System.out.println("looks like a bit of a wait, " + lname +".");
     }
     else if(d > 0)
     {
         System.out.println("it's gonna be a while, " + lname +".");
     }
     else if(e > 0)
     {
         System.out.println("not going anywhere for a while, " + lname +".");
     }
     else
     {
         System.out.println("            ");
     }
     
    }
}
