package Librarys;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Иван", "+491701234562", "ivan@gmail.com");
        Author author2 = new Author("Бадер", "+491502183322", "bader@gmail.com");
        Author author3 = new Author("Алесия", "+491722249392", "alesia@gmail.com");

        Book book1 = new Book("Learn Java", "12-20-2022", 1, author1);
        Book book2 = new Book("Learn HTML", "8-5-2021", 3, author1);
        Book book3 = new Book("PHP for beginners", "10-2-2023", 1, author2);
        Book book4 = new Book("C# for dummies", "12-20-2022", 1, author3);

        Library library = new Library();

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.printAuthor(1);
        library.printAuthor(2);
        library.printAuthor(3);

        library.printBook(1);
        library.printBook(2);
        library.printBook(3);
        library.printBook(4);

        library.printAuthorBooks(1);
        library.printAuthorBooks(2);
        library.printAuthorBooks(3);

        library.removeAuthor(2);
        library.printAuthor(2);
        library.printAuthorBooks(2);

    }

}