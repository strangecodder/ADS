package pract_4.task2;

//import pract_4.sizes;

public class Clothes {
    protected char gender;
    protected sizes size;
    protected double cost;
    protected String color;

    Clothes(char gender, sizes size, double cost, String color) {
        this.gender = gender;
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    Clothes(sizes size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "Одежда: " + getClass() + "\n" +
                        "Пол: " + gender + "\n" +
                        "Размер: " + size + "\n" +
                        "Цвет: " + color + "\n" +
                        "Цена: " + cost;
    }
}
