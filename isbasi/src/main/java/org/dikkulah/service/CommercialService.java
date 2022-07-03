package org.dikkulah.service;

import org.dikkulah.dto.EmailDto;
import org.dikkulah.model.Commercial;
import org.dikkulah.repository.jpa.CommercialJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommercialService {
    @Autowired
    private CommercialJpa commercialJpa;

    @Autowired
    private RabbitMQService rabbitMQService;

    public Commercial createCommercial(Commercial request) {

        EmailDto mail = new EmailDto("dikkulah@gmail.com","commercial","Kaydınız tamamlandı.");
        rabbitMQService.sendEmail(mail);

        request.getCheques().forEach(cheque -> cheque.setCommercial(request));
        return commercialJpa.save(request);
    }

    public List<Commercial> getAllCommercials() {
        return commercialJpa.findAll();
    }

    public Commercial getCommercialById(Integer id) {
        return commercialJpa.findById(id).orElseThrow(RuntimeException::new);
    }

    public void deleteCommercialById(Integer id) {
        commercialJpa.deleteById(id);
    }

    public Commercial updateCommercial(Commercial request) {
        return commercialJpa.save(request);
    }

    public List<Commercial> getCommercialByIsActive(Boolean isActive) {
        return commercialJpa.findCommercialByIsActive(isActive);
    }
}
