package kz.halykacademy.bookstore;

import java.util.Date;
import java.util.List;

public class Author implements AuthorProvider {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date theYearOfBirth;
    private List<Book> authorsBooks;

    public Author(int id, String surname, String name, String patronymic,
                  Date theYearOfBirth, List<Book> authorsBooks) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.theYearOfBirth = theYearOfBirth;
        this.authorsBooks = authorsBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getTheYearOfBirth() {
        return theYearOfBirth;
    }

    public void setTheYearOfBirth(Date theYearOfBirth) {
        this.theYearOfBirth = theYearOfBirth;
    }

    public List<Book> getAuthorsBooks() {
        return authorsBooks;
    }

    public void setAuthorsBooks(List<Book> authorsBooks) {
        this.authorsBooks = authorsBooks;
    }

    @Override
    public List<Author> getAll() {
        return null;
    }
}
