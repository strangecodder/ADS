package pract_4_1.ex1;

public class Shape {
    protected String type;
    protected double area;
    protected double perimeter;
    protected double a;
    protected double b;

    protected String getType() {
        return type;
    }

    protected double getArea() {
        return area;
    }

    protected double getPerimeter() {
        return perimeter;
    }

    public String toString() {
        return "Тип фигуры:" + getType() + '\n' +
                "Площадь" + getArea() + '\n' +
                "Периметр" + getPerimeter();
    }
}
