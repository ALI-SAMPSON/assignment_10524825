import java.util.Scanner;
public class Example2 {
 public static void main(String[] args)
 {
     Scanner input = new Scanner(System.in); 
     
     System.out.println("Please enter your first word");
     input.nextLine();
     
     System.out.println("Please enter your second word");
     input.nextLine();
     
     System.out.println("Great then, your first favourite number is:");
     input.nextDouble();
     
     System.out.println("And your second favourite number is:");
     input.nextDouble();
     
     System.out.println("!!!...Welldone...!!! and Thanks for using my Program");
 }    
}
