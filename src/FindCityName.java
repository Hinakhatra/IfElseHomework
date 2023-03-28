import java.util.Scanner;

public class FindCityName {
   //main method
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);//create scanner obj
        System.out.println("Enter any ALPHABET from A to F :");
        String alphabet = scanner.nextLine(); //storing alphabet in variable using scanner obj
         //print city name from A to F with uppercase or lowercase
        if (alphabet.equalsIgnoreCase("a"))
        {
            System.out.println(" Ahmedabad ");
        } else if (alphabet.equalsIgnoreCase("b"))
        {
            System.out.println(" Bangkok ");
        }else if (alphabet.equalsIgnoreCase("c"))
        {
            System.out.println(" Chandigadh ");
        }else if (alphabet.equalsIgnoreCase("d"))
        {
            System.out.println(" Delhi ");
        }else if (alphabet.equalsIgnoreCase("e")) {
            System.out.println(" Ellora ");
        }else if (alphabet.equalsIgnoreCase("f"))
        {
            System.out.println(" Fatehpur ");
        }else
        {
            System.out.println("Invalid Alphabet");
        }
            }
        }
