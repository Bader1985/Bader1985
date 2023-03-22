package Librarys;

public class Book {

    int id;
    String title;
    String publishingDate;
    int version;
    Author author;

    private static int idIncrementer = 0;

    public Book(String title, String publishingDate, int version, Author author) {
        idIncrementer++;
        this.id = idIncrementer;
        this.title = title;
        this.publishingDate = publishingDate;
        this.version = version;
        this.author = author;
    }

}
