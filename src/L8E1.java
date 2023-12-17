public class L8E1 {
    public static void main(String[] args){
        String[] names = {"Ryan", "Paul", "Gracjan", "Marcus","Dyzio"};

        //for (int index = 0; index < names.length; index++) {
            //System.out.println( names[index] );


       // }
        System.out.println(names[0]);
        System.out.println(names[4]);
        System.out.println(names[names.length-5]);
        System.out.format("The number of items in the array is: %d", names.length);
    }

}
