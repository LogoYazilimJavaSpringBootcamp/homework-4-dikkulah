package org.dikkulah.repository.jpa;


import org.dikkulah.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserJpa extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findUserByEmail(String email);

}
