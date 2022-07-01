package org.dikkulah.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dikkulah.dto.EmailDto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
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
