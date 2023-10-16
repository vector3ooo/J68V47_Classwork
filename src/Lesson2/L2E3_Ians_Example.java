package Lesson2;

import java.util.Scanner;

public class L2E3_Ians_Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of item 1");
        String item1name = input.nextLine();
        System.out.println("Enter the name of item 2");
        String item2name = input.nextLine();
        System.out.println("Enter the name of item 3");
        String item3name = input.nextLine();

        System.out.println("Enter the price of item 1");
        double item1price = input.nextDouble();
        System.out.println("Enter the price of item 2");
        double item2price = input.nextDouble();
        System.out.println("Enter the price of item 3");
        double item3price = input.nextDouble();

        System.out.format("%s ......... £%.2f %n", item1name, item1price);
        System.out.format("%s ......... £%.2f %n", item2name, item2price);
        System.out.format("%s ......... £%.2f %n", item3name, item3price);
        System.out.format("TOTAL ... £%.2f %n", (item1price + item2price + item3price));
    }
}
