package experiments;

class Rectangle {

    public static void mojaFunkcja() {
        System.out.println("funkcja");
    }

    public int height;

    public int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculateArea() {
        return this.height * this.width;
    }

    public int calculatePerimeter() {
        return 2 * this.height + 2 * this.width;
    }
}

public class ObjectsFunctionsMembersClasses {
    public static void main(String[] args) {
        // object instance of class Rectangle
        Rectangle prostokat = new Rectangle(20, 10);

        System.out.printf("pole (area) prostokątu %d %n", prostokat.calculateArea());
        System.out.printf("obwód (perimeter) prostokątu %d %n", prostokat.calculatePerimeter());

        Rectangle.mojaFunkcja();

    }
}
