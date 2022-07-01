package org.dikkulah.service;

import org.dikkulah.model.Cheque;
import lombok.extern.slf4j.Slf4j;
import org.dikkulah.repository.cheque.ChequeHibernateImp;
import org.dikkulah.repository.cheque.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j

public class ChequeService {

    @Autowired
    @Qualifier(value = "chequeJdbcImp")
    private ChequeRepository jdbc;

    @Autowired
    @Qualifier(value = "chequeJdbcTemplate")
    private ChequeRepository jdbcTemplate;

    @Autowired
    @Qualifier(value = "chequeHibernate")
    private ChequeRepository hibernateImp;


    public Cheque createCheque(Cheque request) {

        return null;// jdbcTemplate.save(request);

    }

    public List<Cheque> getAllCheques() {


        return null;// chequeHibernateImp.findAll();
    }

    public Cheque getChequeById(Integer id) {
        return null;// chequeHibernateImp.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Cheque updateCheque(Cheque request) {
       // Cheque foundCheque = chequeHibernateImp.findById(request.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));


        //foundCheque.setChequeDate(request.getChequeDate());
        //foundCheque.setTransactionDate(request.getTransactionDate());
        return null;//chequeHibernateImp.save(request);
    }

    public void deleteChequeById(Integer id) {
//        chequeHibernateImp.findById(id).ifPresentOrElse(cheque -> {
//            chequeHibernateImp.delete(cheque);
//            throw new ResponseStatusException(HttpStatus.OK);
//        }, () -> {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        });
    }
}
