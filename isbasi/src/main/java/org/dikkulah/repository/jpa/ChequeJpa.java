package org.dikkulah.repository.jpa;

import org.dikkulah.model.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChequeJpa extends JpaRepository<Cheque,Integer> {
}
