package pract_4_1.ex1;

public class Square extends Shape {

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