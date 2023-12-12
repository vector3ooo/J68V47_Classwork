import java.util.Scanner;

public class L7E2 {
    public static void calculateSum () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.format("The sum of %d and %d is %d",firstNumber,secondNumber,sum);

    }
    public static void main (String[] args) {
        calculateSum();




    }

}
