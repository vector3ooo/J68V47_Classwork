package Lesson4;

import java.util.Scanner;
public class L4E3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Total purchase amount? ");
        double total = input.nextDouble();
        double shippingCost = 0.0;
        if (total < 100) {
            shippingCost = 10.0;
        }
        double ordertotal = total + shippingCost;
        System.out.format("Shipping cost is: £%.2f %n", shippingCost);
        System.out.format("Your final total is: £%.2f %n", ordertotal);


    }

}
