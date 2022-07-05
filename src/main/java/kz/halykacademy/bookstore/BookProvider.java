package kz.halykacademy.bookstore;

import java.util.List;

public interface BookProvider {
    default List<Book> getAll(){
        return null;
    }
}
