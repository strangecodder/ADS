package pract_6.ex4;

public class Computer implements Priceable {
    private String name;
    private int price;

    Computer(String name, int price){
        this.price=price;
        this.name=name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
