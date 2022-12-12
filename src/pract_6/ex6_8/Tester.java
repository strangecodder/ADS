package pract_6.ex6_8;

public class Tester {
    public static void main(String[] args){
        Book book = new Book("Учебник","Жизнь");
        Shop shop = new Shop("Магазин","У дома");

        book.print();
        shop.print();
    }
}
