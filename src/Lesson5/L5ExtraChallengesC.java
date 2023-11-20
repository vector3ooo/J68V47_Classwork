package Lesson5;

import java.util.Scanner;

public class L5ExtraChallengesC{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

        System.out.println("Enter the base pattern: ");
        String pattern = input.nextLine();
        System.out.println("How many time to be reapeted");
        int numberOfTimes = input.nextInt();

        for(int count =1; count < numberOfTimes; count++);{
            System.out.print(pattern);
        }

}}
