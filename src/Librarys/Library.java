package Librarys;

import java.util.ArrayList;

public class Library {

    ArrayList<Author> authors = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void removeAuthor(int id) {
        for (Author author : authors) {
            if (author.id == id) {
                authors.remove(author);
                return;
            }
        }

        System.out.println("Автор с  id " + id + " не найден!");
        System.out.println("----------------------");
    }

    public void printAuthor(int id) {
        for (Author author : authors) {
            if (author.id == id) {
                System.out.println("Автор с id " + id);
                System.out.println("Имя : " + author.name);
                System.out.println("Тел : " + author.phone);
                System.out.println("Email: " + author.email);
                System.out.println("----------------------");
                return;
            }
        }

        System.out.println("Автор с id " + id + " не найден!");
        System.out.println("----------------------");
    }

    public void printAuthorBooks(int id) {
        boolean isAuthorExist = false;
        String authorName = "";

        for (Author author : authors) {
            if (author.id == id) {
                isAuthorExist = true;
                authorName = author.name;
                break;
            }
        }

        if (!isAuthorExist) {
            System.out.println("Книга с id " + id + " не найден!");
            System.out.println("----------------------");
            return;
        }

        System.out.println("Книги автора " + authorName + ":");

        for (Book book : books) {
            if (book.author.id == id) {
                System.out.println("- " + book.title);
            }
        }
        System.out.println("----------------------");
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                books.remove(book);
                return;
            }
        }

        System.out.println("Книга с id " + id + " не найден!");
        System.out.println("----------------------");
    }

    public void printBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                System.out.println("Книга с id " + id);
                System.out.println("Заголовок : " + book.title);
                System.out.println("Версия : " + book.version);
                System.out.println("Дата публикации : " + book.publishingDate);
                System.out.println("Автор : " + book.author.name);
                System.out.println("----------------------");
                return;
            }
        }

        System.out.println("Книга с id " + id + " не найден!");
        System.out.println("----------------------");
    }

}
