import java.util.Scanner;

public class DayName {
   //main method
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner =new Scanner(System.in);   //create scanner obj
        System.out.println("Enter weekday day number(1-7) :"); //user input
        int weekday = scanner.nextInt();  //storing weekday in variable using scanner obj

        if(weekday == 1)
        {
            System.out.println("Monday");
        } else if (weekday == 2)
        {
            System.out.println("Tuesday");
        } else if (weekday == 3)
        {
            System.out.println("Wednesday");
        } else if (weekday == 4)
        {
            System.out.println("Thursday");
        } else if (weekday == 5)
        {
            System.out.println("Friday");
        } else if (weekday == 6)
        {
            System.out.println("Saturday");
        } else if (weekday == 7)
        {
            System.out.println("Sunday");
        }else {
            System.out.println("please enter weekday number between 1-7. ");
        }
    }
}
