package Lesson2;

import java.util.Scanner;

public class L2E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Enter the name of item 1:");
        String apple = input.nextLine();
        System.out.println("Enter the price of item 1:");
        float item1 = input.nextFloat();

        System.out.println("Enter the name of item 2:");
        String banana = input2.nextLine();
        System.out.println("Enter the price of item 2:");
        float item2 = input2.nextFloat();

        System.out.println("Enter the name of item 3:");
        String carrot = input3.nextLine();
        System.out.println("Enter the price of item 3:");
        float item3 = input3.nextFloat();

        float subtotal = item1 + item2 + item3;

        System.out.println("NESMART");
        System.out.format("%s............£%.2f %n",apple,item1);
        System.out.format("%s............£%.2f %n",banana,item2);
        System.out.format("%s............£%.2f %n",carrot,item3);
        System.out.format("SUBTOTAL......£%.2f %n",subtotal);
    }
}
