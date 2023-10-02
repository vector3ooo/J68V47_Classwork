import java.util.Scanner;

public class L2E2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("What is your first number");
//        int num = input.nextInt();
//
//        System.out.print("What is your second number");
//        double price = input.nextDouble();
//
//        System.out.format("Total = £%.2f%n", (price + num));
//        System.out.format("Total = £%.2f%n", (price - num));
//        System.out.format("Total = £%.2f%n", (price * num));
//        System.out.format("Total = £%.2f%n", (price / num));
//        System.out.format("Total = £%.2f%n", (price%num));
//
//        String message = "Hello World";
//        System.out.println(message.indexOf('o')); // 4
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your first number? ");
        int firstNum = input.nextInt();
        System.out.print("What is your second number? ");
        int secondNum = input.nextInt();

        System.out.printf("%d + %d = %d%n", firstNum, secondNum, firstNum + secondNum);
        System.out.printf("%d - %d = %d%n", firstNum, secondNum, firstNum - secondNum);
        System.out.printf("%d * %d = %d%n", firstNum, secondNum, firstNum * secondNum);
        System.out.printf("%d / %d = %f%n", firstNum, secondNum, (double) firstNum / (double) secondNum);
        System.out.printf("%d %% %d = %d%n", firstNum, secondNum, firstNum % secondNum);
        System.out.printf("%d ^ %d = %f%n", firstNum, secondNum, Math.pow(firstNum, secondNum));
    }
}
