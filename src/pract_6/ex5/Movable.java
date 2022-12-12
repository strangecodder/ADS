package pract_6.ex5;

public interface Movable {
    default void print()
    {
        System.out.println("Этот метод выводит что-то");
    }
}
