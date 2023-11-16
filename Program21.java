// Abstract shape class
abstract class Shape {
    public abstract void draw(); // method that all shapes will implement
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius " + radius);
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with width " + width + " and height " + height);
    }
}

public class Program21 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(3, 4);

        s1.draw(); // Outputs: Drawing circle with radius 5
        s2.draw(); // Outputs: Drawing rectangle with width 3 and height 4
    }
}