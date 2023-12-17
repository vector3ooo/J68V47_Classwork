public class L8E1 {
    public static void main(String[] args){
        String[] names = {"Ryan", "Paul", "Gracjan", "Marcus"};
        for (int index = 0; index < names.length; index++) {
            System.out.println( names[index] );


        }
        int[] scores = {78, 85, 62, 49, 98};
        int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];

        System.out.println("The score is: %d");
    }

}
