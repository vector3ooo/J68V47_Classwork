import java.util.Scanner;
public class L5ExtraChallengesA {
    public static void main(String[] args){
        Scanner putIn = new Scanner(System.in);
        System.out.println("Your number of choice:");

        int usernumber = putIn.nextInt();
        for (int i=1; i<=10; i++ )
        {

            System.out.format("%d x %d = %d %n",usernumber,i, (usernumber*i)  );
        }
    }

}
