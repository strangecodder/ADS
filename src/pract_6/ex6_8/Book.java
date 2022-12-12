package pract_6.ex6_8;

public class Book implements Printable{
    private String bookName;
    private String author;

    Book(){}
    Book(String bookName, String author)
    {
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(bookName + " " + author);
    }
}
