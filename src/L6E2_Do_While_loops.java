import javax.swing.*;
import java.util.Scanner;

public class L6E2_Do_While_loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("###____USER____PROGRAM____###");
            System.out.println("1 = Say Hello");
            System.out.println("2 = Tell me the time");
            System.out.println("3 = Tell me a joke");
            System.out.println("4 = Quit");
            System.out.println("Choose option 1-4");

            option = input.nextInt();
            System.out.format("Your choice is %d %n", option);
            if (option == 1) {
                System.out.println("Hello");
            } else if ((option == 2)) {
                System.out.println("Tell me the time");
            } else if ((option == 3)) {
                System.out.println("Tell me the joke");
            } else if ((option == 4)) {
                System.out.println("See u la'ter");

            } else {
                System.out.println("No valid option");
            }

        } while (option != 4);

    }
    public static void experyment(String[] args){

    }
}