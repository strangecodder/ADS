package pract_4_1;

class Shape{
    protected String type;
    protected double area;
    protected double perimeter;
    protected double a;
    protected double b;

    protected String getType(){
        return type;
    }
    protected double getArea(){return area;}
    protected double getPerimeter(){return perimeter;}

    public String toString(){
        return "Тип фигуры:"+getType()+'\n'+
                "Площадь"+getArea()+'\n'+
                "Периметр"+getPerimeter();
    }
}

class Circle extends Shape{

    Circle(double a){
        this.a=a;
    }
    public String getType(){
        return "Circle";
    }
    public double getArea(){
        return 3.14*Math.pow(a,2);
    }
    public double getPerimeter(){
        return 2*3.14*a;
    }

}
class Rectangle extends Shape{

    Rectangle(double a, double b){
        this.a=a;
        this.b=b;
        //type ="Rectangle";
        //area=;
        //perimeter=;
    }
    public String getType(){
        return "Rectangle";
    }
    public double getArea(){
        return a*b;
    }
    public double getPerimeter(){
        return 2*a+2*b;
    }
}
class Square extends Shape{

    Square(double a){
        this.a=a;
    }
    public String getType(){
        return "Square";
    }
    public double getArea(){
        return Math.pow(a,2);
    }
    public double getPerimeter(){
        return 4*a;
    }
}


public class ex1 {
    public static void main(String[] args){
    Square square = new Square(3);
    Rectangle rectangle = new Rectangle(4,6);
    Circle circle = new Circle(4);

    System.out.println(square.toString());
    System.out.println(rectangle.toString());
    System.out.println(circle.toString());
    }
}
