class Rectangle {
    private double length;
    private double width;

    public void setter(double l, double w) {
        length = l;
        width = w;
    }

    public void getter() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

public class propertiesofencapsulation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setter(10, 5);
        r.getter();
        r.calculateArea();
        r.calculatePerimeter();
    }
}