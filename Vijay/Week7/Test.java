package Week7;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Test3();
    }

    static void Test1()
    {
        // Hello obj = new Hello();  //cannot create an object
    }

    static void Test2()
    {
        Derived obj = new Derived();
        obj.print();
    }

    static void Test3()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1, side2, side3: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter color: ");
        String color = input.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
    
}

abstract class Hello
{
     void bro(){}; //non abstract method
}

abstract class Base
{
    Base()
    {
        print();
    }

    abstract void print();
}

class Derived extends Base
{
    int value=2;

    void print()
    {
        System.out.println(value);
    }
}


abstract class GeometricObject {
    private String color;
    private boolean filled;

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    
    String getColor()
    {
        return color;
    }

    boolean isFilled()
    {
        return filled;
    }
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    
}


