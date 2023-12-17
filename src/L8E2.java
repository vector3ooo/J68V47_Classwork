public class L8E2 {
    public static void main(String[] args){
        int[] examScores = {10,20,30,40,50,60,70,80,90,100};

        double sum = 0;

        for (int index = 0; index < examScores.length; index++ ) {
            sum += examScores[index];
            System.out.println(examScores[index]);
        }


        double average = sum / examScores.length;

        System.out.format("The average score is:  ", average);
        System.out.println(average);

    }
}
