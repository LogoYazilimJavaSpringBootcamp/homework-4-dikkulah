package org.dikkulah.repository.jpa;

import org.dikkulah.model.Till;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TillJpa extends JpaRepository<Till, Integer> {
    List<Till> findAllByIsActive(Boolean bool);
}
