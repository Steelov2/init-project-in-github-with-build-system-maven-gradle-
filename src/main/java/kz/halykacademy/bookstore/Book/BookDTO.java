package kz.halykacademy.bookstore.Book;

import kz.halykacademy.bookstore.Author.AuthorDTO;
import kz.halykacademy.bookstore.Publisher.PublisherDTO;

import java.util.List;

public class BookDTO {
    private double price;

    private List<AuthorDTO> authors;

    private List <PublisherDTO> publisher;


    private String name;


    private int numberOfPages;


    private int yearOfIssue;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<AuthorDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDTO> authors) {
        this.authors = authors;
    }


    public List<PublisherDTO> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<PublisherDTO> publisher) {
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
}
