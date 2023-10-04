import java.util.Scanner;

// 1. get first name
// 2. get surname
// 3. get year of birth
// 4. construct username from 3 values
// 5. construct password from 3 values

public class L3E3_with_Piotr {

    public static void main(String[] args) {
        // Something that we can pull user input data
        Scanner input = new Scanner(System.in);

        // 1. Get first name
//        System.out.print("Enter first name: ");
//        String firstName = input.nextLine();
        String firstName = prompt("Enter first name: ", input);

        // 2. Get surname
//        System.out.print("Enter surname: ");
//        String surname = input.nextLine();
        String surname = prompt("Enter surname: ", input);

        // 3. Get year of birth
//        System.out.print("Enter year of birth: ");
//        String yearOfBirth = input.nextLine();
        String yearOfBirth = prompt("Enter year of birth: ", input);

        // 4. Create username
        String username = createUsername(firstName, surname);
        System.out.println("Your username is: " + username);

        // 5. Create password
        String password = createPassword(firstName, surname, yearOfBirth);
        System.out.println("Your password is: " + password);
    }

    private static String prompt(String promptMessage, Scanner input){
        System.out.print(promptMessage);
        return input.nextLine();
    }

    private static String createUsername(String firstName, String surname){
        return firstName.charAt(0) + surname.toLowerCase();
    }

    private static String createPassword(String firstName, String surname, String yearOfBirth){
        return surname.charAt(0) + firstName.substring(0, 3).toUpperCase() + yearOfBirth;
    }
}