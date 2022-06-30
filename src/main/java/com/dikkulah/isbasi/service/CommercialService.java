package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Cheque;
import com.dikkulah.isbasi.model.Commercial;
import com.dikkulah.isbasi.repository.CommercialRepository;
import com.dikkulah.isbasi.repository.Deneme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommercialService {
    @Autowired
    private CommercialRepository commercialRepository;
    @Autowired
    private Deneme deneme;

    public Commercial createCommercial(Commercial request) {

        commercialRepository.save(request);
//        var a =Cheque.builder().commercial(request).price(10D).build();
//        var b =Cheque.builder().commercial(request).price(20D).build();
//        deneme.save(a);
//        deneme.save(b);
//        request.setCheques(new ArrayList<>());
//        request.getCheques().add(a);
//        request.getCheques().add(b);
        deneme.saveAll(request.getCheques());

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
