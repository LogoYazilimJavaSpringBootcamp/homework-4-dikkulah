package org.dikkulah.repository;


import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface AbstactRepository<T,I>   {
    List<T> findAll();
    int insert(T t) throws SQLException;
    Optional<T> get(I id);
    int update(T t);
    int deleteById(I id);
    

}
