package org.dikkulah.repository;

import org.dikkulah.dto.EmailDto;
import org.dikkulah.model.Email;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<EmailDto,Integer> {


}
