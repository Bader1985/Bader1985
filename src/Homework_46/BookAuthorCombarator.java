package Homework_46;

import java.util.Comparator;

public class BookAuthorCombarator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        if (!author1.equals(author2)){
            return author1.compareTo(author2);
        }
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
