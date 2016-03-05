import java.util.Scanner;
public class Example7 {
    public static void main(String[] args)
    {
        double height,weight, answer;
        
        Scanner enter = new Scanner(System.in);
        
        System.out.println("Please enter your weight in metres");
        height = enter.nextDouble();
        
        System.out.println("Please enter your weight in Kilograms");
        weight = enter.nextDouble();
        
        answer = weight / (height * height);
        
        System.out.println("Your BMI is " + answer);
        
    }
    
}
