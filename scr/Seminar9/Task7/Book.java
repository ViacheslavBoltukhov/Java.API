package scr.Seminar9.Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int publishedYear;

    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    // Другие геттеры и методы...

    //    @Override
//    public int compareTo(Book otherBook) {
//        return this.title.compareTo(otherBook.getTitle());
//    }
    @Override
    public int compareTo(Book otherBook) {
        // Сначала сравниваем годы публикации
        int yearCompare = Integer.compare(this.publishedYear, otherBook.getPublishedYear());

        // Если годы одинаковые, сравниваем по названию
        if (yearCompare == 0) {
            return this.title.compareTo(otherBook.getTitle());
        }

        return yearCompare;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("1984", "George Orwell", 1960));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}