import java.util.Scanner;

public class Calculations {
   //main method
    public static void main(String[] args) {
        char ch;
        // Taking input from user using Scanner Class
        Scanner scanner=new Scanner(System.in);   //create scanner obj
        System.out.print("Enter the first number: ");
        int num1=scanner.nextInt();  ////storing num1 in variable using scanner obj
        System.out.print("Enter the second number: ");
        int num2=scanner.nextInt(); //storing num2 in variable using scanner obj
        System.out.print("Enter the operator you want(+, -, *, /) :");
        ch=scanner.next().charAt(0);//storing ch in variable using scanner obj
        if(ch=='+'){
            System.out.println("Addition of "+num1+"+"+num2+" = "+(num1+num2 ));
        }
        else if(ch=='-'){
            System.out.println("Subtraction of "+num1+"-"+num2+" = "+(num1-num2 ));
        }
        else if(ch=='*'){
            System.out.println("Multiplication of "+num1+"x"+num2+" = "+(num1*num2 ));
        }
        else if(ch=='/'){
            System.out.print("Division of "+num1+"/"+num2+" = "+(num1/num2 ));
        }
        else{
            System.out.print("Operator is not available" );
        }
    }
}



