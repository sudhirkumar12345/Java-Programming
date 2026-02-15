package oops;

// Abstract class
abstract class Shape {
    
    // Abstract method
    abstract void area();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

// Main class
public class Abstract_Q {
    public static void main(String[] args) {
        
        Circle c = new Circle(7);
        c.area();

        Rectangle r = new Rectangle(10, 5);
        r.area();

        Triangle t = new Triangle(8, 6);
        t.area();
    }
}
