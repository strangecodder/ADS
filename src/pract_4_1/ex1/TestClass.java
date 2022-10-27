package pract_4_1.ex1;

public class TestClass {
    public static void main(String[] args){
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(4,6);
        Circle circle = new Circle(4);

        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
    }
}
