import java.util.Scanner;

public class ProjectExam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("xXx___SUPPLY--APP___xXx");
        System.out.println();
        System.out.println("_____________");
        System.out.println("WELCOME");
        System.out.println("To use this app you need to be 18 or over");
        System.out.println("Are you 18 or above?");
        String ageofmember = input.nextLine();

        if (ageofmember.equals("Yes")) {
            System.out.println("Thank you, are allowed to use this app");
            System.out.println("To make order please provide your name");
            String name = input.nextLine();
            System.out.println("Please provide your surname");
            String surname = input.nextLine();
            System.out.println("Address where would you place your order");
            String addressfororder = input.nextLine();
            int ddrram1 = 10;
            int ddrram2 = 12;
            int total = (ddrram1 + ddrram2);
            System.out.println("Thank you, here is list of assortment");
            System.out.println("Type in your choice");
            if (ddrram1 == (ddrram1)) {
                System.out.println("10");
                ;


            } else {
                System.out.println("I am sorry, you must be 18 or more");


            }
            //Generate a list of functional requirements for the Two’s Complement app (there should be at least eight)
            //Upload this document to this homework task

        }
    }
}
