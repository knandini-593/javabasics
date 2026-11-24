class Shape {
    String color = "Pink";

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double r = 5.5;

    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    double l = 10, w = 5;

    void calculateArea() {
        System.out.println("Rectangle Area: " + (l * w));
    }
}

public class hierarchy {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayColor();
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.displayColor();
        r.calculateArea();
    }
}
