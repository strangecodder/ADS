package pract_6.ex4;

public interface Priceable {
    default int getPrice(){
        return -1;
    }
}
