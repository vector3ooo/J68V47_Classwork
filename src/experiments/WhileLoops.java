package experiments;

public class WhileLoops {
    public static void main(String[] args) {
        int countDown = 50; // [counter variable declaration]

        while (countDown <= 0) { // [condition]
            System.out.format("%d%n", countDown);
            countDown = countDown - 1; // [counter changer]
        }

        System.out.println("start");
    }
}

/*
Reqiorements

wyślietlić odliczanie a nakońcu wyświetlić "start"
 */
