package experiments;

import java.util.Scanner;
public class If_Statements_With_Else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:   ");
        int age = input.nextInt();

        if(age >= 50){
            System.out.println("You are mid age !");
        }
        else if (age >=18){
            System.out.println("You are adult !");

        } else if (age >=1){
            System.out.println("You are not adult !");

        }

    }
}
