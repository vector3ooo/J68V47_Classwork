//package experiments;
//
//import java.util.Scanner;
//
//public class IP_3_Project {
//    public static void main(String[] args) {
//        mainMenuLanguageChoice();
//    }
//
//
//    private static void mainMenuLanguageChoice() {
//        int option;
//
//        do {
//            System.out.println("###____USER____PROGRAM____###");
//            System.out.println("Choose option 1-2, 0 will quit");
//            System.out.format("%d Polish     \n", 1);
//            System.out.format("%d Spanish    \n", 2);
//            System.out.format("%d Exit       \n", 0);
//
//
//            option = promptUserForOption();
//
//            if (option == 1) {
//                polishMenu();
//            } else if (option == 2) {
//                spanishMenu();
//            }
//
//        } while (option > 0);
//
//    private static void polishMenu() {
//
//        int option;
//
//        do {
//            System.out.println();
//            System.out.println("Choose word");
//            System.out.format("%d Bank       \n", 1);
//            System.out.format("%d Restaurant \n", 2);
//            System.out.format("%d Police     \n", 3);
//            System.out.format("%d Hospital   \n", 4);
//
//            System.out.format("%d Return     \n", 5);
//            System.out.format("%d Exit       \n", 6);
//
//            option = promtUserForOption("Choose a word");
//
//            switch (option) {
//                case 1:
//                    System.out.println("Bank  /bank/");
//                    break;
//                case 2:
//                    System.out.println("Restauracja  /restauracya/");
//                    break;
//                case 3:
//                    System.out.println("Policja  /polEEcya/");
//                    break;
//                case 4:
//                    System.out.println("Szpital  /shpEEtal/");
//                    break;
//                case 5:
//                    System.out.println("Returned");
//            }
//        } while (option == 5);
//    }
//
//    private static void spanishMenu() {
//        int option;
//
//
//        do {
//            System.out.println("Choose word");
//            System.out.format("%d Bank       \n", 1);
//            System.out.format("%d Restaurant \n", 2);
//            System.out.format("%d Police     \n", 3);
//            System.out.format("%d Hospital   \n", 4);
//
//            System.out.format("%d Return     \n", 5);
//            System.out.format("%d Exit       \n", 6);
//
//            option = promptUserForOption("Choose a word");
//
//            switch (option) {
//                case 1:
//                    System.out.println("Banco  /banko/");
//                    break;
//                case 2:
//                    System.out.println("Restaurante  /restaurante/");
//                    break;
//                case 3:
//                    System.out.println("Policja  /polEEcEEya/");
//                    break;
//                case 4:
//                    System.out.println("Hospital  /oshpEEtal/");
//                    break;
//                case 5:
//                    System.out.println("Returned");
//            }
//
//        } while (option == 5);
//
//
//    }
//    private static int promptUserForOption() {
//        Scanner input = new Scanner(System.in);
//        return input.nextInt();
//    }
//    private static int promptUserForOption (String message){
//        System.out.println(messege);
//        return promptUserForOption();
//    }
//
//}