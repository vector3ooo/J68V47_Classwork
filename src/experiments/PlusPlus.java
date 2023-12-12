package experiments;

public class PlusPlus {
    public static void main(String[] args) {
        System.out.println("increase by 1 AFTER read");
        int a = 1;
        System.out.println(a++);
        System.out.println(a);

        System.out.println("increase by 1 BEFORE read");
        int b = 1;
        System.out.println(++b);
        System.out.println(b);

        System.out.println("decrease by 1 AFTER read");
        int c = 1;
        System.out.println(c--);
        System.out.println(c);

        System.out.println("decrease by 1 BEFORE read");
        int d = 1;
        System.out.println(--d);
        System.out.println(d);
    }
}
