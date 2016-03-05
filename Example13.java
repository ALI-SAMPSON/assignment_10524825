import java.util.Scanner;
public class Example13 {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       double ethweigh, V , M , J , S , U , N ;
       int num;
       
       System.out.println("Please enter your currenbt earth weight");
       ethweigh = input.nextDouble();
       
       System.out.println("I have information for the following planets:");
       System.out.println("   1. Venus  2. Mars   3.Jupiter");
       System.out.println("   4. Saturn 5. Uranus 6.Neptune\n");
       
       System.out.println("Which planet are you visiting?");
       num = input.nextInt();
      
       
       if (num == 1)
       {
            V = (ethweigh * 0.78);
            System.out.println("Your weight would be :" + V);
       }
       else if ( num == 2)
       {
           M = (ethweigh * 0.39);
           System.out.println("Your weiight would be :"  +  M);
       }
       else if (num == 3)
       {
           J = (ethweigh * 2.65);
           System.out.println("Your weight would be :"  +  J);
       }
       else if ( num == 4)
       {
           S = (ethweigh * 1.17);
           System.out.println("Your weight would be :"  +  S);
       }
       
       else if(num == 5)
       {
           U = (ethweigh * 1.05);
           System.out.println("Your weight would be :"  +  U);
       }
       else if(num == 6)
       {
           N = (ethweigh * 1.23);
           System.out.println("Your weight wpuld be :"  +  N);
       }
       else 
       {
           System.out.println("Error...!!!  Not part of the planets... ");
       }
       
       
       
       
       
       
       
  }
}
