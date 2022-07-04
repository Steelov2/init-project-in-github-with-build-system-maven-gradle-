package kz.halykacademy.bookstore;

import java.util.List;

public class Publisher implements PublisherProvider {
    int id;
    String name;
    List<Book> publishedBooks;

    @Override
    public List<Publisher> getAll() {
        return null;
    }
}
