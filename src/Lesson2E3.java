import java.util.Scanner;

public class Lesson2E3 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        //Create a program that takes in the name and price of three items,
        // calculates the totalCost,
        // and then displays a receipt similar to the following:
        // NESMARTItem 1..........£0.76Item 2..........£1.33Item 3..........£0.55SUBTOTAL..£2.64
        // You should make use of the format command when displaying your receipt.Your program output should look similar to this//
        System.out.println("Enter the name of item 1:");
        String apple= input.nextLine();
        System.out.println("Enter the price of item 1:");
        float item1 = input.nextInt();

        System.out.println("Enter the name of item 2:");
        String banana = input.nextLine();
        System.out.println("Enter the price of item 2:");
        float item2 = input.nextInt();
        System.out.println("Enter the name of item 3:");
        String carrot = input.nextLine();
        System.out.println("Enter the price of item 3:");
        float item3 = input.nextInt();
        System.out.format("SubTotal = %.2f%n£",(item1+item2+item3));




        //System.out.format("Total = £%.2f%n", (item1 + item2 + item3));





    }}
