package org.dikkulah.listener;


import lombok.extern.slf4j.Slf4j;
import org.dikkulah.dto.EmailDto;
import org.dikkulah.repository.EmailRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailListener {
	@Autowired
	private EmailRepository emailRepository;

	@RabbitListener(queues = "isbasi.email")
	public void emailListener(@NotNull EmailDto emailDto) {
		log.info("email to: {}", emailDto.getTo());
		log.info("email title: {}", emailDto.getTitle());
		log.info("email : {}", emailDto.getEmail());
		emailRepository.save(emailDto);
	}

}
