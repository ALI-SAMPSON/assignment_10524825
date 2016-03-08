import java.util.Scanner;
public class Example23 {
    public static void main(String []args)
    {
     double height,weight, answer;
        
        Scanner enter = new Scanner(System.in);
        
        System.out.println("Please enter your height in metres");
        height = enter.nextDouble();
        
        System.out.println("Please enter your weight in Kilograms");
        weight = enter.nextDouble();
        
        answer = weight / (height * height);
        
        System.out.println("Your BMI is " + answer);
        
        if(answer < 15.0)
        {
            System.out.println("BMI Category: very severely underweight");
        }
        else if( answer >= 15.0 || answer <= 16.0)
        {
            System.out.println("BMI Category: severely underweight");
        }
        else if(answer >=16.1 || answer <=18.4)
        {
            System.out.println("BMI Category: underweight");
        }
        else if(answer >= 18.5 || answer < 25.0)
        {
            System.out.println("BMI Category: normal weight");
        }
        else if(answer >=25.0 || answer < 30.0)
        {
            System.out.println("BMI Category: overweight");
        }
        else if(answer >= 30.0 || answer < 35.0)
        {
            System.out.println("BMI Category: moderately obese");
        }
        else if(answer >= 35.0 || answer < 40.0)
        {
            System.out.println("BMI Category: severely obese");
        }
        else if(answer >= 40.0)
        {
            System.out.println("BMI Category: very severely obese");
        }
        else
        {
            System.out.println("             ");
        }

    }
}
