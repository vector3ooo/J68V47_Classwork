package experiments;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Polonez", "Fiat", "Ford"};

        cars[0] = "Vivaro";

        System.out.println(cars[0]);
        arrayNext();
        ianExamples();

    }

    public static void ianExamples() {
        int[] scores = {};
        int[] scores2 = new int[0];
        // To create an empty array of given size:
        int[] scores3 = new int[10];
        String[] guests = new String[4];
        //To change the value of a specific position in an array;
        int[] scores4 = new int[1];
        scores4[3] = 51; //Assigns the value 51 to element index 3 of the scores4 array

        String[] guests2 = {""};
        guests2[2] = "'Ian'"; //Assigns the string 'Ian' to element index 2 of the guests2 array
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
