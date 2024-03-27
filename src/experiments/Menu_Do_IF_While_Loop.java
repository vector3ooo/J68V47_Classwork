package experiments;
import java.util.Scanner;

public class Menu_Do_IF_While_Loop {public static void main(String[] args) {
    mainManu();
}

    /**
     * Pierwsze Menu
     */
    private static void mainManu() {
        int option;

        // Przynajmniej raz uruchamiasz menu
        do {
            System.out.println();
            System.out.println("Select category");
            System.out.format("%d  Books\n", 1);
            System.out.format("%d  Games\n", 2);
            System.out.format("%d  [ EXIT ]\n", 0);

            option = promptUserForOption();

            if (option == 1) {
                bookMenu();
            } else if (option == 2) {
                System.out.println("Sorry not implemented 🙁");
            }
            // Dopuki użytkownik wybiera opcje doputy to menu się kręci
            // Jak wybierze 0 -> wyjdzie z pętli while i wróci to poprzedniej metody
            // Tak jakbyś matrioszkę otwierał io zamykał
            // Schemat każdego menu jest taki sam
        } while (option > 0);
    }

    /**
     * Menu dla książek
     */
    private static void bookMenu() {
        int option;

        do {
            System.out.println();
            System.out.println("Select category");
            System.out.format("%d  Fantasy\n", 1);
            System.out.format("%d  Sci-Fic\n", 2);
            System.out.format("%d  Thriller\n", 3);
            System.out.format("%d  [ BACK ]\n", 0);

            option = promptUserForOption();

            switch (option) {
                case 1:
                    bookFantasyMenu();
                    break;
                case 2:
                    System.out.println("Sorry not implemented 🙁");
                    break;
                case 3:
                    System.out.println("Sorry not implemented 🙁");
                    break;
            }
        } while (option > 0);
    }

    /**
     * Menu dla książek fantastyki
     */
    private static void bookFantasyMenu() {
        int option;

        do {
            System.out.println();
            System.out.println("Select category");
            System.out.format("%d  Hobbit\n", 1);
            System.out.format("%d  Lord of the Rings\n", 2);
            System.out.format("%d  Eragorn\n", 3);
            System.out.format("%d  Mage apprentice\n", 4);
            System.out.format("%d  <- BACK\n", 0);

            option = promptUserForOption("Please pick a book"); // Przykad uzycia "przecionej" metody

            switch (option) {
                case 1:
                    System.out.println("Here you go: Hobbit");
                    break;
                case 2:
                    System.out.println("Here you go: Lord of the Rings");
                    break;
                case 3:
                    System.out.println("Here you go: Eragorn");
                    break;
                case 4:
                    System.out.println("Here you go: Mage apprentice");
                    break;
            }
        } while (option > 0);
    }

    /**
     * Metoda do pytania użytkownika o wybór.
     * Poto żeby nie pisać w każdym menu tego samego - programista jest leniwy i nie pisze kodu dwa razy
     * Menu u góry też można by tak napisać żeby nie powielać schematu, Ale to innym razem
     * @return
     */
    private static int promptUserForOption() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * Przeciążona metoda która pozwala dodać własną wiadomość
     * @param message
     * @return
     */
    private static int promptUserForOption(String message) {
        System.out.println(message);
        return promptUserForOption();
    }
}

