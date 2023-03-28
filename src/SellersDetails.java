import java.util.Scanner;

public class SellersDetails {
   // main method
    public static void main(String[] args) {
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in); //create scanner obj
        System.out.println("Enter seller's ID:");
        String id = scanner.nextLine();  //storing id in variable using scanner obj
        System.out.println("Enter seller's Name:");
        String name = scanner.nextLine(); //storing name in variable using scanner obj
        System.out.println("Enter the basic salary of seller:");
        double basicsalary = scanner.nextInt();//storing basicsalary in variable using scanner obj
        System.out.println("Enter the amount:");
        double amount = scanner.nextInt();  //storing amount in variable using scanner obj

        //commission on various amount
        if (amount>=50000)
        {
            System.out.println("Commission is 35%");
        } else if (amount>=30000)
        {
            System.out.println("Commossion is 20%");
        } else if (amount>=20000)
        {
            System.out.println("Commission is 10%");
        } else if (amount>=10000)
        {
            System.out.println("Commission is 2%");
        }else
        {
            System.out.println("No Commission");
        }


    }
}
