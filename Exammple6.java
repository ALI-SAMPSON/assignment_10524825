import java.util.Scanner;
public class Exammple6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double fnum,snum,thnum,result;
        
        System.out.println("|---------------------------|");
        System.out.println("WELCOME TO MY DUFF CALCULATOR");
        System.out.println("|---------------------------|\n");
        
        System.out.println("Please enter your first number:");
        fnum = input.nextDouble();
        
        System.out.println("Kindly enter your secoond number please:");
        snum = input.nextDouble();
        
        System.out.println("And your third number:");
        thnum = input.nextDouble();
        
        result = (fnum + snum + thnum)/2;
        
        System.out.println("Your final result is : " + result);
        
        
    }
}
