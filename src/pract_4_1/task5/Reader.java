package pract_4_1.task5;

public class Reader {
    private String fullName;
    private int readerTicket;
    private String faculty;
    private String birthdayDate;
    private String phoneNumber;
    private String[] booksName;

    public void takeBook(int number)
    {
        System.out.println(fullName + " взял " + number + " книг.");
    }
    public void takeBook(String[] booksName)
    {
        System.out.println(fullName + " взял книги:");
        for(int i = 0; i<booksName.length; i++)
        {
            System.out.println(booksName[i] + " ");
        }
    }
    public void takeBook(Book[] books)
    {
        System.out.println(fullName + "взял: ");
        for (int i = 0; i< books.length;i++)
        {
            System.out.println(books[i]);
        }
    }

    public void returnBook(int number)
    {
        System.out.println(fullName + " вернул " + number + " книг.");
    }
    public void returnBook(String[] booksName)
    {
        System.out.println(fullName + " вернул ");
        for (int i = 0; i<booksName.length;i++)
        {
            System.out.println(booksName[i] + " ");
        }
    }
    public void returnBook(Book[] books)
    {
        System.out.println(fullName + " вернул.");
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }

}
