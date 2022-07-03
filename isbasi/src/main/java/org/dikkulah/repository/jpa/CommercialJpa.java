package org.dikkulah.repository.jpa;

import org.dikkulah.model.Commercial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CommercialJpa extends JpaRepository<Commercial, Integer> {
    List<Commercial> findCommercialByIsActive(Boolean isActive);
}
