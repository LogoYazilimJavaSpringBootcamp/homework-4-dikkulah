package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Commercial;
import com.dikkulah.isbasi.model.User;
import com.dikkulah.isbasi.repository.UserRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private RabbitTemplate rabbitTemplate;

   /* public User createUser(User userRequest) {
        //userRequest.getCommercialList().add(new Commercial("ali"));
        rabbitTemplate.convertAndSend("isbasi.email", "isbasi.email",userRequest.getEmail());

        return userRepository.save(userRequest);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(RuntimeException::new);
    }

    public List<Commercial> getCommercialsByUserEmail(String email) {
        return userRepository.findCommercialsByUserEmail(email).orElseThrow(RuntimeException::new);
    }*/
}
