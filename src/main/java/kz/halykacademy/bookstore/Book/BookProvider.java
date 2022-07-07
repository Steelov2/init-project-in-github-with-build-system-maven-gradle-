package kz.halykacademy.bookstore.Book;

import java.util.List;

public interface BookProvider {
    List<BookDTO> getAll();
}
