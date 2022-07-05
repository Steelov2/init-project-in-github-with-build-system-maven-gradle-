package kz.halykacademy.bookstore;

import java.util.List;

public interface PublisherProvider {
    default List<Publisher> getAll(){
        return null;
    }

}
