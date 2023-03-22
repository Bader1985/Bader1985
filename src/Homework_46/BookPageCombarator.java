package Homework_46;

import java.util.Comparator;

public class BookPageCombarator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        Integer page1 = o1.getPages();
        Integer page2 = o2.getPages();
        if (!page1.equals(page2)){
            return page1.compareTo(page2);
        }
        return o1.getTitle().compareTo(o2.getTitle());

    }
}
