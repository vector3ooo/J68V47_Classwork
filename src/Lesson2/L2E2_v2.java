package Lesson2;

import java.util.Scanner;

public class L2E2_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number");
        int num = input.nextInt();

        System.out.println("What is your second number");
        int price = input.nextInt();
        float divResult = (float) num / (float) price;

        System.out.println(num + "+" + price + "=" + (num+price));
        System.out.println(num + "-" + price + "=" + (num-price));
        System.out.println(num + "*" + price + "=" + (num*price));
        System.out.println(num + "/" + price + "=" + divResult);
        System.out.println(num + "%" + price + "=" + (num%price));
        System.out.println(num + "^" + price + "=" + (int) Math.pow(num,price));
    }}
