import java.util.Scanner;
public class L7E1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option = 0;
        static void showMenu() {
            System.out.println("Menu");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
        }

        static int getOption() {
                System.out.println("Enter your choice: ");
                return input.nextInt();

        }
    }


       {int option = 0;
           DO
           {CALL showMenu;
       	     SET (option) TO VALUE RETURNED FROM CALL getOption;
       	     IF (option = 1) THEN {
           ;
           CALL option1;
       }ELSE {
               IF option = 2 THEN;
               CALL option2;
               ELSE IF option = 3 THEN;
               CALL option3;
               ELSE IF (option = 4)
               THEN;
               DISPLAY("Bye!");
               ELSE;
               DISPLAY "This isn't a valid option. Try a number between 1 and 4.”;
               END IF;
           }WHILE (option != 4);
       }




    }


}
//Alter your the code provided so that your menu makes use of functions or procedures.
// It should function in exactly the same way as it did before the addition of subroutines
// The pseudocode for the main procedure is:

