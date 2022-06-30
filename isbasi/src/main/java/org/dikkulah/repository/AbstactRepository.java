package org.dikkulah.repository;


import java.util.List;
import java.util.Optional;

public interface AbstactRepository<T,I>   {

    List<T> findAll();
    void insert(T t);
    Optional<T> get(I id);
    void update(T t);
    void delete(I id);

}
