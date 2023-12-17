package experiments;

public class Array_and_Loops_and_For_Each_Loop {
    public static void main(String[] args){
        int[] examScores = {10,20,30,40,50,60,70,80,90,100};

        for (int index = 0; index < examScores.length; index++ ) {
            System.out.println(examScores[index]);

        }
        anotherMethod();

    }
    public static void anotherMethod(){
        String[] names = {"Ryan","Paul","Gracjan","Marcus"};
        for (String value: names) {
            System.out.println(value);
        }


    }



























}
