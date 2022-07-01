package org.dikkulah.repository.jpa;

import org.dikkulah.model.Till;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TillJpa extends JpaRepository<Till, Integer> {
    List<Till> findAllByIsActive(Boolean bool);
}
