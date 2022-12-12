package pract_18.task1;

public class Tester {
    public static void main(String[] args) {
        int x =3;
        int y =0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e){
            System.out.println("Ошибка деления"+x+"на"+y);
        }
    }
}
