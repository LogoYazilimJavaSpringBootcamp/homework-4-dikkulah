package org.dikkulah.service;

import org.dikkulah.model.Till;
import org.dikkulah.repository.TillHibernate;
import org.dikkulah.repository.TillJdbcImp;
import org.dikkulah.repository.TillJdbcTemplate;
import org.dikkulah.repository.jpa.TillJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TillService {

    @Autowired
    private TillJpa tillJpa;
    @Autowired
    private TillJdbcTemplate jdbcTemplate;
    @Autowired
    private TillJdbcImp jdbc;
    @Autowired
    private TillHibernate hibernate;

    public Till createTill(Till request)  {
        //hibernate
        hibernate.openCurrentSessionwithTransaction();
        hibernate.insert(request);
        hibernate.closeCurrentSessionwithTransaction();
        return request;
        //jdbc
        //jdbc.insert(request);
        //return request;
        //jdbc template
        //jdbcTemplate.insert(request);
        //return request;
        //jpa
        //return tillJpa.save(request);
    }

    public List<Till> getAllTills() {
        //hibernate
        hibernate.openCurrentSession();
        List<Till> tills = hibernate.findAll();
        hibernate.closeCurrentSession();
        return tills;

        //jdbc template
        //return jdbc.findAll();
        //jdbc template
        //return jdbcTemplate.findAll();
        // jpa
        //return tillJpa.findAll();
    }

    public Till getTillById(Integer id) {
        //hibernate
        hibernate.openCurrentSession();
        Optional<Till> till = hibernate.get(id);
        hibernate.closeCurrentSession();
        return till.orElseThrow(RuntimeException::new);

        //jdbc template
        //return jdbcTemplate.get(id).orElseThrow(RuntimeException::new);

        //jdbc
        //return jdbc.get(id).orElseThrow(RuntimeException::new);

        //JPA
        //return tillJpa.findById(id).orElseThrow(RuntimeException::new);
    }

    public Till updateTill(Till request) {
        //hibernate
        hibernate.openCurrentSessionwithTransaction();
        hibernate.update(request);
        hibernate.closeCurrentSessionwithTransaction();
        return request;
        //jdbc
        //jdbc.update(request);
        //return request;

        //jdbc template
        //jdbcTemplate.update(request);
        //return request;

        //jpa
        //return tillJpa.save(request);
    }

    public void deleteTillById(Integer id) {
        //hibernate
        hibernate.openCurrentSessionwithTransaction();
        Optional<Till> till = hibernate.get(id);
        hibernate.deleteById(id);
        hibernate.closeCurrentSessionwithTransaction();

        //jdbc
        // jdbc.deleteById(id);
        //jdbc template
        //jdbcTemplate.deleteById(id);
        //jpa
        //tillJpa.deleteById(id);
    }

    public List<Till> getTillsByIsActive(Boolean valueOf) {
        return tillJpa.findAllByIsActive(valueOf);
    }
}
