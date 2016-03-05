import java.util.Scanner;
public class Example1 {

    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        
        int age;
        double height;
        double weight;
        
        System.out.println(" How old are?. ");
        age = enter.nextInt();
        
        System.out.println(" How tall are you?. ");
        height = enter.nextDouble();
        
        System.out.println(" How much do you weigh?. ");
        weight = enter.nextDouble();
        
        System.out.println(" So you are " + age + " years old , " + height + " metres tall " + " and  weigh " + weight + " Kilograms ");
    }
}

    
