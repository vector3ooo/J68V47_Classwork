import java.util.Scanner;

public class L2E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lesson 2");
        String welcome = input.nextLine();

        System.out.print("What is your name");
        String name = input.nextLine();

        System.out.print("Could you tell me about your hobby");
        String hobby = input.nextLine();
        System.out.println("I like programming and hard life with it when errors appear and must find out how to solve it");


        System.out.print("What is your first number");
        int num = input.nextInt();

        System.out.print("What is your second number");
        double price = input.nextDouble();

        System.out.format("Total = £%.2f%n", (price + num));
        System.out.format("Total = £%.2f%n", (price - num));
        System.out.format("Total = £%.2f%n", (price * num));
        System.out.format("Total = £%.2f%n", (price / num));
        System.out.format("Total = £%.2f%n", (price%num));

        String message = "Hello World";
        System.out.println(message.indexOf('o')); // 4


    }
}