import java.util.Scanner;

public class L7E1 {
    static{

        Scanner input = new Scanner(System.in);

        public static void showMenu;
        {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
        }

        public static int getOption () {
            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            return input3.nextInt();

        }

            int option = 0;
            do {
                showMenu();
                if (option = 1) {
                    option1();
                } else if (option = 2) {
                    option2();
                } else if (option = 3) {
                    option3();
                } else if (option = 4) {
                    System.out.println("Bye!");

                } else {

                    System.out.println("This isn't a valid option. Try a number between 1 and 4.");
                }
            } while (option != 4);


    }}
//Alter your the code provided so that your menu makes use of functions or procedures.
// It should function in exactly the same way as it did before the addition of subroutines
// The pseudocode for the main procedure is:

