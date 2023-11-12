package experiments;
import java.util.Scanner;
public class MathClassHypotenuse
    { public static void main(String[] args){
        Scanner input = new Scanner((System.in));
        System.out.println("Enter side x:");
        double x = input.nextDouble();
        System.out.println("Enter side y:");
        double y = input.nextDouble();

        double z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: " + z);



    }

}
