package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Cheque;
import com.dikkulah.isbasi.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Slf4j

public class ChequeService {

    @Autowired
    @Qualifier(value = "chequeJdbc")
    private ChequeRepository jdbc;

    @Autowired
    @Qualifier(value = "chequeJdbcTemplate")
    private ChequeRepository jdbcTemplate;

    @Autowired
    private ChequeHibernate chequeHibernate;


    public Cheque createCheque(Cheque request) {

        return null;// jdbcTemplate.save(request);

    }

    public List<Cheque> getAllCheques() {


        return chequeHibernate.findAll();
    }

    public Cheque getChequeById(Integer id) {
        return null;// chequeHibernate.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Cheque updateCheque(Cheque request) {
       // Cheque foundCheque = chequeHibernate.findById(request.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));


        //foundCheque.setChequeDate(request.getChequeDate());
        //foundCheque.setTransactionDate(request.getTransactionDate());
        return null;//chequeHibernate.save(request);
    }

    public void deleteChequeById(Integer id) {
//        chequeHibernate.findById(id).ifPresentOrElse(cheque -> {
//            chequeHibernate.delete(cheque);
//            throw new ResponseStatusException(HttpStatus.OK);
//        }, () -> {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        });
    }
}
