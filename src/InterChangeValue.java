import java.util.Scanner;

public class InterChangeValue {
  //main method
    public static void main(String[] args) {
        int a,b,c;  //a and b are to swap
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);//create scanner obj
        System.out.println("Enter the value of A and B");
        a = scanner.nextInt();//use scanner for value a
        b = scanner.nextInt();//use scanner for value b
        System.out.println("Before interchange value:"+a +" "+b);
        //interchange the values
        c=a;
        a=b;
        b=c;
        System.out.println("After interchange value:"+a +" "+b);
        System.out.println();


    }
}
