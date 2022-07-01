package org.dikkulah.repository.jpa;

import org.dikkulah.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductJpa extends JpaRepository<Product,Integer> {
    List<Product> findAllByIsActive(Boolean bool);
}
