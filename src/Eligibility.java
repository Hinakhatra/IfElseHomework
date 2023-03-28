import java.util.Scanner;

public class Eligibility {
    // Taking input from user using Scanner Class
    Scanner scanner = new Scanner(System.in);
    public void eligibleForVote()
    {
        //acknowledge the user what to enter
        System.out.println("Please enter your age");
        //storing age in variable using scanner object
        int age = scanner.nextInt();
        if (age>=18)
        {
            System.out.println("you are eligible for vote as your age is :"+age);
        }else {
            System.out.println("you are not eligible for vote as your age is :"+age);}

    }
    public static void main(String[] args) {
        Eligibility eligibility =new Eligibility();
        //calling method using class object
        eligibility.eligibleForVote();
    }

}



