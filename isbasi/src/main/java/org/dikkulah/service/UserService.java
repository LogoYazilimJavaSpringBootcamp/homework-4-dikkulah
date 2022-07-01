package org.dikkulah.service;

import org.dikkulah.model.Commercial;
import org.dikkulah.model.User;
import org.dikkulah.repository.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserJpa userJpa;

    public User createUser(User userRequest) {
        return userJpa.save(userRequest);
    }

    public List<User> getAllUsers() {
        return userJpa.findAll();
    }

    public User getUserByEmail(String email) {
        return userJpa.findByEmail(email).orElseThrow(RuntimeException::new);
    }

    public List<Commercial> getCommercialsByUserEmail(String email) {
        return userJpa.findUserByEmail(email).orElseThrow(RuntimeException::new).getCommercialList();
    }
}
