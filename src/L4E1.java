import java.util.Scanner;

public class L4E1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

//Extend the deposit program so that it asks the user for:
// ● their first name● their surname● the total value of their order e.g. 400.59
// ● the amount the user wishes to pay as a deposit
        //The program should then display a receipt showing
        // ● The total value of the order● The amount paid as deposit
        // ● The remaining amount to be paid later● If they also received a free toasterYour program output should look similar to this

        System.out.println("(^_^) DEPOSIT PROGRAM (^_^)");
        System.out.print("Enter your first name:");
        String firstName = input.nextLine();
        System.out.print("Enter your second name:");
        String secondName = input.nextLine();
        System.out.print("Enter the total value of your order: ");
        int totalValueOfTheOrder = input.nextInt();

        System.out.print("Enter amount you wish to pay as deposit:");
        int amountOfDeposit = input.nextInt();

        //int deposit = 150;


        System.out.println("== RECEIPT ==");

        System.out.print(firstName.substring(0, 1).toUpperCase());
        System.out.print(secondName.substring(0,1).toUpperCase());
        System.out.println(secondName.substring(1,10).toLowerCase());
        System.out.println(totalValueOfTheOrder);
        System.out.println(amountOfDeposit);
        System.out.println(totalValueOfTheOrder-amountOfDeposit);
        if (amountOfDeposit > 100) {
            System.out.println("You get a free toaster!");
        }

        System.out.println("Have a nice day");

        //Scanner input = new Scanner(System.in);
        //	System.out.print("How many items? ");
        //	int num = input.nextInt();
        //
        //	System.out.print("Price per item £");
        //	double price = input.nextDouble();
        //
        //	System.out.format("Total = £%.2f%n", (price * num));






    }
}
