package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Till;
import com.dikkulah.isbasi.repository.TillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TillService {

//    @Autowired
//    private TillRepository tillRepository;

  /*  public Till createTill(Till request) {
        return tillRepository.save(request);
    }

    public List<Till> getAllTills() {
        return tillRepository.findAll();
    }

    public Till getTillById(Long id) {
        return tillRepository.finById(id).orElseThrow(RuntimeException::new);
    }

    public Till updateTill(Long id, Till request) {
        return tillRepository.updateById(id,request);
    }

    public Boolean deleteTillById(Long id) {
        return tillRepository.deleteById(id);
    }

    public List<Till> getTillByIsActive(Boolean valueOf) {
        return tillRepository.finByIsActive(valueOf);
    }*/
}
