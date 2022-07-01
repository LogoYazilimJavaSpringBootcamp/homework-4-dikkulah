package org.dikkulah.repository.cheque;

import org.dikkulah.model.Cheque;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;


public class ChequeHibernateImp implements ChequeRepository {



    @Override
    public List<Cheque> findAll() {
        return null;// entityManager.openSession().();
    }

    @Override
    public void insert(Cheque cheque) {

    }

    @Override
    public Optional<Cheque> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public void update(Cheque cheque) {

    }

    @Override
    public void delete(Integer id) {

    }
}
