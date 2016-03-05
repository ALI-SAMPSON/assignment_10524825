import java.util.Scanner;
public class Example4 {
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in); 
        String fstname, lstname, logname;
        double grade, gpa;
        int idnum;
        
        System.out.println("Please enter the following innformation for the processing of your form\n");
        
        System.out.println("First name:");
        fstname = enter.nextLine(); 
        
        System.out.println("Last name:");
        lstname = enter.nextLine();
        
        System.out.println("Login name:");
        logname = enter.nextLine();
        
        System.out.println("Grade(4 - 20):");
        grade = enter.nextDouble();
        
        System.out.println("Student ID:");
        idnum = enter.nextInt();
        
        System.out.println("GPA:");
        gpa = enter.nextDouble();
        System.out.println("\n");
        
        System.out.println("Your summarised information include:\n");
        
        System.out.println("Your Name is: " + lstname + ", " + fstname );
        System.out.println("Your Grade is: " + grade);
        System.out.println("Your Student ID is: " + idnum);
        System.out.println("Your Login name is: " + logname);
        System.out.println("Your GPA is: " + gpa);
    }
}
