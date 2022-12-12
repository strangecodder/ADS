package pract_6.ex6_8;

public interface Printable {
    default void print()
    {
        System.out.println("Этот метод выводит что-то");
    }
}
