import java.util.Scanner;

public class L4E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable ALWAYS named in lower case letters or pascalCase e.g. thisIsMyVariable

        System.out.print("What is the capital of Spain(Start typing in with Cap letter: ");
        String spainCapital = input.nextLine();
        ;

        // two things going on
        // println - prints text into console
        // <string>.equals(<string>) - compares two strings. When match return true, else return false
        // basically equals() returns Boolean variable which always can have either TRUE or FALSE
        System.out.println(spainCapital.equals("Madrid"));

        // do the string comparison
        Boolean match = spainCapital.equals("Madrid");
        // do something on each case
        if (match = true) {
            // when there is a match
            System.out.println(true);
            System.out.println("Well done that is correct");
        } else {
            // when there is not a match
            System.out.println(false);
            System.out.println("The answer is Madrid");
        }


        {System.out.println("What is the capital of UK: ");
        String ukCapital = input.nextLine();

        Boolean match2 = spainCapital.equals("London");
        // do something on each case
        if (match2 = true) {
            // when there is a match
            System.out.println(true);
            System.out.println("Well done that is correct");
        } else {
            // when there is not a match
            System.out.println(false);
            System.out.println("The answer is London");
        }


        System.out.print("What is the capital of Italy: ");
        String italyCapital = input.nextLine();

        Boolean italyCapital1 = spainCapital.equals("Rome");
            // do something on each case
            if (italyCapital1 = true) {
                // when there is a match
                System.out.println(true);
                System.out.println("Well done that is correct");
            } else {
                // when there is not a match
                System.out.println(false);
                System.out.println("The answer is Rome");
    }




    //q1 What is the capital of spain ?
    //q2 what is the capital of the UK?
    //q3 what is the capital of Italy ?

    // and the computer displays True if it can match any of the text the user enters to the answer ''madrid''
    // and the computer dispaly False if it cannot match any of the text to the correct answer}
    // answer must look mADriD, lONDon, Rome}
}   }  }