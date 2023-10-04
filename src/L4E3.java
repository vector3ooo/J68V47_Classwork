import java.util.Scanner;
public class L4E3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How much would you like to deposit? ");
        int deposit = input.nextInt();
        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        } else {
            System.out.println("Enjoy your mug!");
        }

    }

}
