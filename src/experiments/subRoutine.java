import java.util.Scanner;

public class MenuProgram {
    static Scanner scanner = new Scanner(System.in);

    // Function to display the menu
    static void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Exit");
    }

    // Function to get user option
    static int getOption() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Function for Option 1
    static void option1() {
        System.out.println("You selected Option 1");
    }

    // Function for Option 2
    static void option2() {
        System.out.println("You selected Option 2");
    }

    // Function for Option 3
    static void option3() {
        System.out.println("You selected Option 3");
    }

    public static void main(String[] args) {
        int option = 0;

        do {
            showMenu();
            option = getOption();

            if (option == 1) {
                option1();
            } else if (option == 2) {
                option2();
            } else if (option == 3) {
                option3();
            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }

        } while (option != 4);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
