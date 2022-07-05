package kz.halykacademy.bookstore;

import java.util.List;

public class Book implements BookProvider{
    private int id;
    private double price;
    private List<Author> authors;
    private List <Publisher> publisher;
    private String name;
    private int numberOfPages;
    private int yearOfIssue;

    public Book(int id, double price, List<Author> authors,
                List<Publisher> publisher, String name, int numberOfPages, int yearOfIssue) {
        this.id = id;
        this.price = price;
        this.authors = authors;
        this.publisher = publisher;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Publisher> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<Publisher> publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
