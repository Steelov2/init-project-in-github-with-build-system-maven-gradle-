package kz.halykacademy.bookstore;

import java.util.List;

public class Publisher implements PublisherProvider {
    private int id;
    private String name;
    private List<Book> publishedBooks;

    public Publisher(int id, String name, List<Book> publishedBooks) {
        this.id = id;
        this.name = name;
        this.publishedBooks = publishedBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    @Override
    public List<Publisher> getAll() {
        return null;
    }
}
