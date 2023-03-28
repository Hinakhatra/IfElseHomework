import java.util.Scanner;

public class DigitAlphabetSymbol {
    //main method
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);  //create scanner obj
        System.out.println("Enter any character :");
        char cha = scanner.next().charAt(0);//storing cha in variable using scanner obj

        if (cha>='0' && cha<='9')     //Type 0-9
        {
            System.out.println(cha + " is a DIGIT.");
        } else if ((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))  //Type a-z or A-Z
        {
            System.out.println(cha + " is a ALPHABET");
        }else
        {
            System.out.println(cha + " is a SPECIAL CHARACTER");  //Type special character
        }
    }
}
