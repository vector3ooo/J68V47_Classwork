package experiments;

public class  DoWhileLoops {
    public static void main(String[] args) {
        int countDown = -50;

        do {
            System.out.format("%d%n", countDown);
            countDown = countDown - 1;
        } while (countDown > 0);

        System.out.println("start");


//        do {
//
//        } while (1 < 2);
//
//        while (1 < 2) {
//
//        }
    }
}

/*
Reqiorements

wyślietlić odliczanie a nakońcu wyświetlić "start"
 */
