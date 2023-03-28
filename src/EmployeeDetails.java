import java.util.Scanner;

public class EmployeeDetails {
    //create variables
    static String employeid;
    static String employename;
    static int basicsalary,HRA,TA,DA,PF,Grosssalary;

   //main method
    public static void main(String[] args) {
        details();
        calculate();
    }
    public static void details(){
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);//create scanner obj
        System.out.println("Enter the employee id");
        employeid = scanner.nextLine();//use scanner for emlpoyeid
        System.out.println("Enter the employee name");
        employename = scanner.nextLine();//use scanner for employename
        System.out.println("Enter the basic salary of an employee");
        basicsalary = scanner.nextInt();//use scanner for basicsalary
    }
    public static void calculate(){     //calculate all the parameter
    HRA=(basicsalary*10)/100;
    DA=(basicsalary*8)/100;
    TA=(basicsalary*9)/100;
    PF=(basicsalary*20)/100;
    Grosssalary=(basicsalary+HRA+TA+DA-PF);
        System.out.println("Gross salary is;"+ (basicsalary+HRA+TA+DA-PF));
    }

    }
