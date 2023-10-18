import java.util.Scanner;

public class L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain: ");
        String spainCapital = input.nextLine();;
        if (spainCapital.toLowerCase().equals("madrid")) {

            System.out.println(true);
        } else {
            // when there is not a match
            System.out.println(false);
            System.out.println("The answer is madrid");
        }

        System.out.print("What is the capital of UK: ");
        String ukCapital = input.nextLine();

        System.out.print("What is the capital of Italy: ");
        String italyCapital = input.nextLine();







    }
}
