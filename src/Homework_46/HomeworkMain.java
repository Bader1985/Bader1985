package Homework_46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkMain {

    //Используйте класс Book (книга) из предыдущего домашнего задания.
    //
    //Создайте компаратор, который позволит сортировать книги по названию,
    // при одинаковых названиях - по автору (и там, и там - по алфавиту)
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Author 3", "Book 3", 250));
        books.add(new Book("Author 3", "Book 3", 251));
        books.add(new Book("Author 3", "Book 3", 252));

        Collections.sort(books);
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

