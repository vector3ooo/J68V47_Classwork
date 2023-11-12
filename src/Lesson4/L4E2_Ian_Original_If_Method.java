package Lesson4;

import java.util.Scanner;

public class L4E2_Ian_Original_If_Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of Spain");
        String spainCapital = input.nextLine();

        if(spainCapital.toLowerCase().contains("madrid")==false); {
            System.out.println("The correct answer is Madrid");
        }
    }
}
