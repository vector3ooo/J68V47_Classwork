package Lesson2;

import java.util.Scanner;

public class L2E1 {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String name = input.nextLine();
//
//        String firstName = "Bob";
//        System.out.println(firstName);
//
//        firstName = "Mary";
//        System.out.println(firstName);
//
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lesson 2");
        String welcome = input.nextLine();

        System.out.print("What is your name");
        String name = input.nextLine();

        System.out.print("Could you tell me about your hobby");
        String hobby = input.nextLine();
        System.out.println("I like programming and hard life with it when errors appear and must find out how to solve it");
    }
}
