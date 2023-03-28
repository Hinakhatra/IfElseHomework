import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
    int number;  // create variable
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);  //create scanner obj
        System.out.println("Enter the number which you want to check");
        number = scanner.nextInt();  //storing number in variable using scanner obj

        if (number>0)    //if number is grater than 0 then positive no
        {
            System.out.println(number+" is positive number");
        }
        else if (number<0) //if number is less than 0 then negative no
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is zero number ");
    }
    }
    }
