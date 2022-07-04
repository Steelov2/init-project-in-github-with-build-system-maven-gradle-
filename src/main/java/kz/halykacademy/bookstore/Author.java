package kz.halykacademy.bookstore;

import java.util.Date;
import java.util.List;

public class Author {
    int id;
    String surname;
    String name;
    String patronymic;
    Date theYearOfBirth;
    List<Book> authorsBooks;
}
