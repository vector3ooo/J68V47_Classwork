import java.util.Scanner;

public class L7E1_Piotr {
    public static void showMenu() {
        System.out.println("###____USER____PROGRAM____###");
        System.out.println("1 = Say Hello");
        System.out.println("2 = Tell me the time");
        System.out.println("3 = Tell me a joke");
        System.out.println("4 = Quit");
        System.out.println("Choose option 1-4");
    }

    public static void option1() {
        System.out.println("Hello");
    }

    public static void option2() {
        System.out.println("Tell me the time");
    }

    public static void option3() {
        System.out.println("Tell me the joke");
    }

    public static int getOption() {
        Scanner input = new Scanner(System.in);
        int localFunctionVariableOption = input.nextInt();
        System.out.format("Your choice is %d %n", localFunctionVariableOption);
        return localFunctionVariableOption;
    }

    public static void main(String[] args) {


        int option;
        do {
            showMenu();
            option = getOption();
            if (option == 1) {
                option1();
            } else if ((option == 2)) {
                option2();
            } else if ((option == 3)) {
                option3();
            } else if ((option == 4)) {
                System.out.println("See you later");
            } else {
                System.out.println("This is not valid option");
                System.out.println("Avalaible options: 1,2,3,4");
            }
        } while (option != 4);
    }


    public static void dupa(int twojaStara) {
        if (twojaStara == 0) {
            return;
        }

        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");
        System.out.println("Print something");


    }
}
//Alter your the code provided so that your menu makes use of functions or procedures.
// It should function in exactly the same way as it did before the addition of subroutines
// The pseudocode for the main procedure is:

