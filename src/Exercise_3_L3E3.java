import java.util.Scanner;

public class Exercise_3_L3E3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name");
        String firstname = input.nextLine();

        System.out.print("Enter your surname");
        String surname = input.nextLine();

        System.out.print("Enter your year of birth");
        String yearofbirth = input.nextLine();

        System.out.print("Username");

        //System.out.print(firstname.charAt(0)); // reason it goes red is because charAt returns a character data type, not a string
        System.out.print(firstname.substring(0,1).toUpperCase());
        //System.out.print(firstname.toUpperCase());
        System.out.println(surname.toLowerCase());

        System.out.print("Password");

        String Password =(surname.substring(0,1));
        System.out.println(Password.toLowerCase());
        //System
        System.out.print(firstname.toUpperCase());
        System.out.print(yearofbirth);
    }


}