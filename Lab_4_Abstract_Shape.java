abstract class Shape {
    int dim1;
    int dim2;
   
    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
   
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }
   
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }
   
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, radius);
    }
   
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(10, 8);
        Shape circle = new Circle(7);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
