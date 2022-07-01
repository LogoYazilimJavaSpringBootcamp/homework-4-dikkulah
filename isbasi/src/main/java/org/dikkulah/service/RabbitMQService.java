package org.dikkulah.service;

import org.dikkulah.dto.EmailDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void sendEmail(EmailDto email) {
            rabbitTemplate.convertAndSend("isbasi.email","isbasi.email", email);
    }
}
