package pract_4_1.ex1;

public class Rectangle extends Shape {

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        //type ="Rectangle";
        //area=;
        //perimeter=;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * a + 2 * b;
    }
}
