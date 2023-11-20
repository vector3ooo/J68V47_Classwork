package Lesson5;

import java.util.Scanner;
public class L5ExtraChallengesB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int score = 0;
        int userAnswer;
        int answer;
        for(int count=1; count <= 10; count++){
            System.out.format("What is %d + %d?", count, count*count);
            userAnswer = input.nextInt();
            answer = count + (count*count);

            if (answer == userAnswer){
                System.out.println("CORRECT!");
                score++;
            }else {
                System.out.format("WRONG! The answer is %d %n",answer);
            }
        }System.out.format("GAME OVER. Your score is %d",score);

}}
