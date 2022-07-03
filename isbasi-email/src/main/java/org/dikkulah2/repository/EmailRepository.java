package org.dikkulah2.repository;

import org.dikkulah2.dto.EmailDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<EmailDto,Integer> {


}
