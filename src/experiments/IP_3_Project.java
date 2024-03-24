package experiments;

import java.util.Scanner;

public class IP_3_Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("###____USER____PROGRAM____###");
            System.out.println("1 = Polish");
            System.out.println("2 = Spanish");
            System.out.println("3 = Exit");
            System.out.println("Choose option 1-3");

            option = input.nextInt();
            System.out.format("Your choice is %d %n", option);


            if (option == 1) {
                System.out.println("Choose word");
                System.out.println("1 = Bank");
                System.out.println("2 = Restaurant");
                System.out.println("3 = Police");
                System.out.println("4 = Hospital");

                System.out.println("5 = Return");
                System.out.println("6 = Exit");

                int wordNumber = input.nextInt();

                if (wordNumber == 1) {
                    System.out.println("Bank  /bank/");
                } else if (wordNumber == 2) {
                    System.out.println("Restauracja  /restauracya/");

                } else if (wordNumber >= 3) {
                    System.out.println("Policja  /polEEcya/");

                } else if (wordNumber >= 4) {
                    System.out.println("Szpital  /shpEEtal/");


                } else if (wordNumber != 5) {


                } else if (wordNumber >= 6) {
                    System.out.println();

                } while (wordNumber != 6);

                break;

            } else if ((option == 2)) {


                if (option == 2) {
                    System.out.println("Choose word");;
                    System.out.println("1 = Bank");
                    System.out.println("2 = Restaurant");
                    System.out.println("3 = Police");
                    System.out.println("4 = Hospital");

                    System.out.println("5 = Return");
                    System.out.println("6 = Exit");

                    int wordNumberS = input.nextInt();

                    if (wordNumberS == 1) {
                        System.out.println("Banco  /banko/");
                    } else if (wordNumberS == 2) {
                        System.out.println("Restaurante  /restaurante/");

                    } else if (wordNumberS >= 3) {
                        System.out.println("Policja  /polEEcEEya/");

                    } else if (wordNumberS >= 4) {
                        System.out.println("Hospital  /oshpEEtal/");


                    } else if (wordNumberS != 5) {


                    } else if (wordNumberS >= 6) {
                        System.out.println();

                    }
                    while (wordNumberS != 6) ;

                };



            } else if ((option == 3)) {
                System.out.println("See u la'ter");



            } else {
                System.out.println("No valid option");

            }

        } while (option == 4);
        return;




    }
}