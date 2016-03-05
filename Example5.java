import java.util.Scanner;
public class Example5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nam;
        int age;
        
        System.out.println("Hello , what is your name?");
        nam = input.nextLine();
        
        System.out.println("Hi " + nam + ", how old are you");
        age = input.nextInt();
        
        System.out.println("Do you know that in five years time, you will be 50 years old?");
        System.out.println("And five years ago, you were 10 years old! Soo surprised? ");
        
    }
}
