package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Commercial;
import com.dikkulah.isbasi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product,Integer> {

}
