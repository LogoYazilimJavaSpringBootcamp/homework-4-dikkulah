package org.dikkulah.service;

import lombok.extern.slf4j.Slf4j;
import org.dikkulah.model.Cheque;
import org.dikkulah.repository.jpa.ChequeJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Slf4j
public class ChequeService {


    @Autowired
    private ChequeJpa chequeJpa;

    public Cheque createCheque(Cheque request) {

        return chequeJpa.save(request);
    }

    public List<Cheque> getAllCheques() {
        return chequeJpa.findAll();
    }

    public Cheque getChequeById(Integer id) {
        return chequeJpa.findById(id).orElseThrow(RuntimeException::new);
    }

    public Cheque updateCheque(Cheque request) {
        Cheque foundCheque = chequeJpa.findById(request.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        foundCheque.setChequeDate(request.getChequeDate());
        foundCheque.setTransactionDate(request.getTransactionDate());
        return chequeJpa.save(request);
    }

    public void deleteChequeById(Integer id) {
        chequeJpa.findById(id).ifPresentOrElse(cheque -> {
            chequeJpa.delete(cheque);
            throw new ResponseStatusException(HttpStatus.OK);
        }, () -> {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }
}
