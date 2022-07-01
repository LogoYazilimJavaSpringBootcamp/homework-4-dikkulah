package org.dikkulah.service;

import org.dikkulah.dto.EmailDto;
import org.dikkulah.model.Commercial;
import org.dikkulah.repository.CommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommercialService {
    @Autowired
    private CommercialRepository commercialRepository;

    @Autowired
    private RabbitMQService rabbitMQService;

    public Commercial createCommercial(Commercial request) {

        commercialRepository.save(request);
//        var a =Cheque.builder().commercial(request).price(10D).build();
//        var b =Cheque.builder().commercial(request).price(20D).build();
//        deneme.save(a);
//        deneme.save(b);
//        request.setCheques(new ArrayList<>());
//        request.getCheques().add(a);
//        request.getCheques().add(b);
        //deneme.saveAll(request.getCheques());
        EmailDto mail = new EmailDto("dikkulah@gmail.com","commercial","Kaydınız tamamlandı.");
        rabbitMQService.sendEmail(mail);
        return commercialRepository.save(request);
    }

    public List<Commercial> getAllCommercials() {
        return commercialRepository.findAll();
    }

    public Commercial getCommercialById(Integer id) {
        return commercialRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void deleteCommercialById(Integer id) {
         commercialRepository.deleteById(id);
    }

    public Commercial updateCommercial( Commercial request) {
        return commercialRepository.save(request);
    }

//    public List<Commercial> getCommercialByIsActive(Boolean isActive) {
//        return commercialRepository.findByIsActive(isActive);
//    }
}
