package kz.halykacademy.bookstore;

import java.util.List;

public class Book implements BookProvider{
    int id;
    double price;
    List<Author> authors;
    List <Publisher> publisher;
    String name;
    int numberOfPages;
    int yearOfIssue;

    @Override
    public List<Book> getAll() {
        return null;
    }
}
