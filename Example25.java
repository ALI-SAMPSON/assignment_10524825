import java.util.Scanner;
public class Example25 {
    public static void main(String[]args)
    {
        System.out.println("Comparing \"axe\" with \"dog\" produces");
        int a = "axe".compareTo("dog");
        System.out.println(a);
        
        System.out.println("Comparing \"ear\" with \"head\" produces");
        int b = "ear".compareTo("head");
        System.out.println(b);
        
        System.out.println("Comparing \"mouse\" with \"rat\" produces");
        int c = "mouse".compareTo("rat");
        System.out.println(c);
        
        
        System.out.println("Comparing \"mat\" with \"mattress\" produces");
        int d = "mat".compareTo("mattress");
        System.out.println(d);
        
        System.out.println("Comparing \"sandals\" with \"shoe\" produces");
        int e = "sandals".compareTo("shoe");
        System.out.println(e);
        System.out.println("\n");
        //System.out.println("Comparing \"applebee's\" with \"apple\" produces");
        //System.out.println("applebee's".compareTo("apple"));
        
        System.out.println("Comparing \"knife\" with \"dog\" produces");
        int f = "knife".compareTo("dog");
        System.out.println(f);
        
        System.out.println("Comparing \"head\" with \"ear\" produces");
        int g = "head".compareTo("ear");
        System.out.println(g);
        
        System.out.println("Comparing \"rat\" with \"mouse\" produces");
        int h = "rat".compareTo("mouse");
        System.out.println(h);
        
        System.out.println("Comparing \"mattress\" with \"mat\" produces");
        int i = "mattress".compareTo("mat");
        System.out.println(i);
        
        System.out.println("Comparing \"shoe\" with \"sandal\" produces");
        int j = "shoe".compareTo("sandals");
        System.out.println(j);
        System.out.println("\n");
        
        System.out.println("Comparing \"mat\" with \"mat\" produces");
        int k = "mat".compareTo("mat");
        System.out.println(k);
        
        System.out.println("Comparing \"shoe\" with \"shoe\" produces");
        int l = "shoe".compareTo("shoe");
        System.out.println( l );
        
    }
}
