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

public class L3E3_Loan_Calculation {
    // public method
    // static so we can execute the main methods
    // void because it just runs (does not return anything
    public static void main(String[] args) {

        // when you have a bug in IntelliJ click on the error (move cursor) and alt+enter and it will help
       Scanner input = new Scanner(System.in);
        //The cost of loan
        System.out.println("Loan amount: £");
        float L = input.nextFloat();
        //The interest rate
        System.out.print("Interest Rate (APR %): ");
        int rate = input.nextInt();
        //the number of years for the loan
        System.out.print("Number of years: ");
        int years = input.nextInt();

        float j = ((float) rate / 100)/12;
        int n = years = 12;
        //Calculate monthly payments with the following formula
        float M = (float) (L * (j/(1 - Math.pow((1+j),-n))));

        System.out.format("Monthly payment for this loan is: £%.2f ",M);




    }


}