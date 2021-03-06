package org.dikkulah.repository.jpa;


import org.dikkulah.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface UserJpa extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findUserByEmail(String email);

}
