package org.dikkulah.repository.jpa;

import org.dikkulah.model.Commercial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommercialJpa extends JpaRepository<Commercial, Integer> {
    List<Commercial> findCommercialByIsActive(Boolean isActive);
}
