package Lesson5;

import java.util.Scanner;
public class L5E1_Iteration_FOR {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base number");
        int countX = input.nextInt();

        {for( int  count=1; count<=12; count++ )

            System.out.format("%d x %d = %d %n",countX, count, (countX*count)  );
            // code to be repeated
        }




    }






}
