import java.util.Scanner;

// we have to have a class because in java everything is a class and object
// Basic hotkeys to know
// alt+enter - hints on error
// ctrl+p - hint on method arguments
// ctrl+q - quick documentation
// ctrl+space - autocompete
// ctrl+w - highlight text recursively
// ctrl+/ - Comment and uncomment
//


// Material Theme UI Lite - plugin do JetBrains tools

public class Exercise_3_L3E3 {
    // public method
    // static so we can execute the main methods
    // void because it just runs (does not return anything
    public static void main(String[] args) {

        // when you have a bug in IntelliJ click on the error (move cursor) and alt+enter and it will help
       Scanner input = new Scanner(System.in);

        System.out.println("Enter your firstname");
        String firstname = input.nextLine();
        System.out.print("Enter your surname");
        String surname = input.nextLine();
        System.out.print("Enter your year of birth");
        String yearofbirth = input.nextLine();

        System.out.println("Username");

        //System.out.print(firstname.charAt(0)); // reason it goes red is because charAt returns a character data type, not a string
        System.out.print(firstname.substring(0, 1).toUpperCase());
        System.out.print(firstname.toUpperCase());
        System.out.println(surname.toLowerCase());

        System.out.println("Password");
        System.out.print(surname.substring(0,1).toLowerCase());
        System.out.print(firstname.toUpperCase());
        System.out.print(yearofbirth);


    }


}