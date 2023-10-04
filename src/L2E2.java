import java.util.Scanner;

public class L2E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number");
        int num = input.nextInt();

        System.out.println("What is your second number");
        double price = input.nextDouble();

        System.out.format("Total = £%.2f%n", (price + num));
        System.out.format("Total = £%.2f%n", (price - num));
        System.out.format("Total = £%.2f%n", (price * num));
        System.out.format("Total = £%.2f%n", (price / num));
        System.out.format("Total = £%.2f%n", (price%num));

            }
}