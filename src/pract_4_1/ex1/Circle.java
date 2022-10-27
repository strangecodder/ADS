package pract_4_1.ex1;

public class Circle extends Shape {

    Circle(double a) {
        this.a = a;
    }

    public String getType() {
        return "Circle";
    }

    public double getArea() {
        return 3.14 * Math.pow(a, 2);
    }

    public double getPerimeter() {
        return 2 * 3.14 * a;
    }

}
