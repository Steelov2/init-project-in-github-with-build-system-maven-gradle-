package kz.halykacademy.bookstore;

import java.util.Date;
import java.util.List;

public class Author implements AuthorProvider {
    int id;
    String surname;
    String name;
    String patronymic;
    Date theYearOfBirth;
    List<Book> authorsBooks;

    @Override
    public List<Author> getAll() {
        return null;
    }
}
