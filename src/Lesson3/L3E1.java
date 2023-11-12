package Lesson3;

import java.util.Scanner;

public class L3E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your year of birth YYYY: ");
        String year = scanner.nextLine();

        String username = firstname.substring(0,1) + surname.toLowerCase();
        System.out.println("Username: "+username);
        String password = surname.substring(0,1).toLowerCase() + firstname.substring(0,6).toUpperCase();
        System.out.println("Password: "+password);
    }
}
