import java.util.Scanner;

public class StudentMarkSheet1 {
    //main method
    public static void main(String[] args) {
        //create variables
        String name;
        int roll,maths,sci,eng;
        // Taking input from user using Scanner Class
        Scanner scanner = new Scanner(System.in);       //create scanner obj
        System.out.println("please enter your Name: " );
        name = scanner.nextLine();                      //scanner obj for name
        System.out.println("please enter your Roll No: ");
        roll = scanner.nextInt();                       //scanner obj for roll number
        System.out.println("Please enter marks for Maths,Sci and Eng: ");
        maths = scanner.nextInt();                      //scanner obj for subjects
        sci   = scanner.nextInt();
        eng   = scanner.nextInt();                      //create variable total
        int total =maths+sci+eng;
        System.out.println("Total Marks for 3 subjects:"+total);//total of 3 subjects
        float percentage = (total/3);
        System.out.println("percentage of 3 subjects: "+percentage);

        if ((maths>=35) && (sci>=35) && (eng>=35)){
            System.out.println("you are pass");
    }else {
            System.out.println("you are fail");
        }
}
}
