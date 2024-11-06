import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Area_abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width of the rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.area());

        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.area());

        sc.close();
    }
}
