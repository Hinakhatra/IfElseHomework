import java.util.Scanner;

public class PrintAlphabetLowerCase {
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner =new Scanner(System.in); //create scanner obj
        System.out.println("Enter any character start with Uppercase :");
        String uppercase = scanner.nextLine();  //storing uppercase in variable using scanner obj
        String uppercase1 = uppercase.toLowerCase();//storing uppercase1 in variable using scanner obj
        System.out.println(uppercase1);



    }
}
