package org.dikkulah.repository.jpa;

import org.dikkulah.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ProductJpa extends JpaRepository<Product,Integer> {
    List<Product> findAllByIsActive(Boolean bool);
}
