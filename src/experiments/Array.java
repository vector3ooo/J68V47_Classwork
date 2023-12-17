package experiments;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Polonez", "Fiat", "Ford"};

        cars[0] = "Vivaro"; //Although Polonez is 0, assigning Vivaro to cars[0], it will display Vivaro instead Polonez
        System.out.println(cars[0]);

        arrayNext();
        ianExamples();
    }

    public static void ianExamples() {
        int[] scores = {};
        int[] scores2 = new int[0];
        // To create an empty array of given size:
        int[] scores3 = new int[10];
        String[] guests = {"Chris", "Susan", "Bill", "Satya", "Bonus BGC"};
        System.out.println(guests[0]);;
        int[] scores4 = {78,85,62,49,98};
        System.out.println(scores4[0] + scores4[1] + scores4[2] + scores4[3] + scores4[4]); //This will sum all numbers in scores4
        String[] guests2 = {"Ian"};
         //Assigns the string 'Ian' to element index 2 of the guests2 array
        System.out.println(guests2[0]);
        System.out.println(scores4[3]);
        System.out.println(guests.length);
    }

    public static void arrayNext() {

        // array = used to store multiple values within a single variable

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


    }


}
