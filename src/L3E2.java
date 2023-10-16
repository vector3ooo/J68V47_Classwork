import java.util.Scanner;

public class L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain: ");
        String spainCapital = input.nextLine();;
        System.out.println(spainCapital.equals("Madrid"));

        Boolean match = spainCapital.equals("Madrid");
        // do something on each case
        if (match == true) {
            // when there is a match
            System.out.println(true);
        } else {
            // when there is not a match
            System.out.println(false);
        }

        System.out.print("What is the capital of UK: ");
        String ukCapital = input.nextLine();

        System.out.print("What is the capital of Italy: ");
        String italyCapital = input.nextLine();







    }
}
