package org.dikkulah.repository;


import org.dikkulah.model.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Cheque, Integer> {

}
