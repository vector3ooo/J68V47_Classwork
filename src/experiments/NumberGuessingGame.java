package experiments;


import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner putIn = new Scanner(System.in);

        int min = 0;
        int max = 10;

        boolean isCorrectAnswer;

        do {

            int a = generateRandomInt(min, max);
            int b = generateRandomInt(min, max);

            System.out.printf("%d + %d = ? ", a, b);

            int playerAnswer = putIn.nextInt();

            int correctAnswer = a + b;

            isCorrectAnswer = playerAnswer == correctAnswer;

        } while (isCorrectAnswer);

        System.out.println("GAME OVER");
    }

    private static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * max) + min;
    }
}
