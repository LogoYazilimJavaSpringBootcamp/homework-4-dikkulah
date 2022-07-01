package org.dikkulah.service;

import org.dikkulah.model.Till;
import org.dikkulah.repository.jpa.TillJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TillService {

    @Autowired
    private TillJpa tillJpa;

   public Till createTill(Till request) {
        return tillJpa.save(request);
    }

    public List<Till> getAllTills() {
        return tillJpa.findAll();
    }

    public Till getTillById(Integer id) {
        return tillJpa.findById(id).orElseThrow(RuntimeException::new);
    }

    public Till updateTill(Till request) {
        return tillJpa.save(request);
    }

    public void deleteTillById(Integer id) {
         tillJpa.deleteById(id);
    }

    public List<Till> getTillsByIsActive(Boolean valueOf) {
        return tillJpa.findAllByIsActive(valueOf);
    }
}
