package pract_6.ex3;

public interface Nameable {
    default String getName(){
        return "Этот метод выводит имя объекта";
    }
}
