import java.util.Scanner;

public class L7E3 {
    public static int askQuestion(int liczba1, int liczba2) {
        Scanner input = new Scanner(System.in);
        System.out.format("What is" + liczba1 + "+" + liczba2 + "?");
        int odpowiedUzytkownika = input.nextInt();
        return odpowiedUzytkownika;
    }

    public static int correctAnswer(int score) {
        System.out.println("Correct !");
        score++;

        return score;

    }

    public static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong! The answer is" + answer);
        lives--;
        System.out.println("You have" + lives + "lives left");
        return lives;
    }

    public static void gameOver(int score, int lives) {
        System.out.println("Game over. Your score is" + score);
        if (lives > 0) {
            System.out.println("Well done");
        }
        ;


    }

    public static void main(String[] args) {
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;

        do {
//            int number1 = count;
//            int number2 = count * count;
            int number1 = (int) (Math.random() * 100); // count;
            int number2 = (int) (Math.random() * 100); // count * count;

            // (int) (Math.random() * 100); szybki sposób na losowe generowanie liczb, w tym wypadku midzy 0 --- 99
            // (int) (Math.random() * 101) - 50; szybki sposób na losowe generowanie liczb, w tym wypadku midzy -50 --- 50
            // (int) (Math.random() * 6) + 1; rzut kostk K6

            userAnswer = askQuestion(number1, number2);
            answer = number1 + number2;

            if (answer == userAnswer) {
                correctAnswer(score);
//                score = correctAnswer();
            } else if (answer == userAnswer) {
                wrongAnswer(answer, lives);

            }
            count++;

        } while (count <= 6 && lives > 0);

     gameOver(score,lives);
    }


}
// && = AND
// || = OR