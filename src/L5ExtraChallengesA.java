import java.util.Scanner;
public class L5ExtraChallengesA {
    public static void main(String[] args){
        Scanner putIn = new Scanner(System.in);
        int usernumber = putIn.nextInt();
        for (int i=0; i<=10; i++ )
        {

            System.out.format("%d x %d = %d %n",putIn, i, (usernumber*i)  );
        }
    }

}
