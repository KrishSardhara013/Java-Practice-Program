//Describe abstract class called Shape which has three subclasses say Triangle, Rectangle and Circle. Define one method area() in the abstract class and override this area() in these three subclasses to calculate for specific object.

import java.util.Scanner;
abstract class Shape {
    Scanner in = new Scanner(System.in);
    abstract double area();
}
class Triangle extends Shape {
    private double base, height;
    @Override
    double area() {
        System.out.println("Enter base:");
        base = in.nextDouble();
        System.out.println("Enter height:");
        height = in.nextDouble();
        return 0.5 * base * height; 
    }
}
class Rectangle extends Shape {
    private double width, height;
   @Override
       double area() {
        System.out.println("Enter width:");
        width = in.nextDouble();
        System.out.println("Enter height");
        height = in.nextDouble();
        return width * height; 
    }
}
class Circle extends Shape {
    private double radius;
    @Override
    double area() {
        System.out.println("Enter radius:");
        radius = in.nextDouble();
        return Math.PI * radius * radius; 
    }
}

public class override_example{
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Circle Area: " + circle.area());
    }
}
