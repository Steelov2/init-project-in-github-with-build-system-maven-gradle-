package kz.halykacademy.bookstore;

import java.util.List;

public interface AuthorProvider {
    default List<Author> getAll(){
        return null;
    }

}
