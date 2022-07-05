package kz.halykacademy.bookstore;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Publisher implements PublisherProvider {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="publisherId")
    private int id;

    @Column(name="publisherName")
    private String name;

    @Column(name="publishedBooks")
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
