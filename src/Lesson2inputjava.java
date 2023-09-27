import java.util.*;

public class Lesson2inputjava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of item 1");
        String item1name = Scanner.nextLine();
        System.out.println("Enter the name of item 2");
        String item2name = Scanner.nextLine();
        System.out.println("Enter the name of item 3");
        String item3name = Scanner.nextLine();

        System.out.println("Enter the price of item 1");
        int item1price = Scanner.nextDouble();
        System.out.println("Enter the price of item 2");
        int item2price = Scanner.nextDouble();
        System.out.println("Enter the price of item 3");
        int item3price = Scanner.nextDouble();

        System.out.format("%s ......... £%.2f %n", item1name, item1price);
        System.out.format("%s ......... £%.2f %n", item2name, item2price);
        System.out.format("%s ......... £%.2f %n", item3name, item3price);
        System.out.format("TOTAL ... £%.2f %n", (item1price+item2price+item3price) );

    }
}