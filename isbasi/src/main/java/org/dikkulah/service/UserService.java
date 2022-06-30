package org.dikkulah.service;

import org.springframework.stereotype.Service;

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
