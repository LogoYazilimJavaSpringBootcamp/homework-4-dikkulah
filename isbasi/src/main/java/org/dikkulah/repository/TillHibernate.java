package org.dikkulah.repository;

import org.dikkulah.model.Till;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class TillHibernate implements AbstactRepository<Till, Integer> {
    private final EntityManager entityManager;
    @Autowired
    public TillHibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    private Session currentSession;

    private Transaction currentTransaction;




    public void openCurrentSession() {
        currentSession = entityManager.unwrap(Session.class).getSessionFactory().openSession();
    }

    public void openCurrentSessionwithTransaction() {
        currentSession = entityManager.unwrap(Session.class).getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }



    @Override
    @SuppressWarnings("unchecked")
    public List<Till> findAll() {
        return getCurrentSession().createQuery("from Till ").list();
    }

    @Override
    public int insert(Till till)  {

        return (int) getCurrentSession().save(till);
    }

    @Override
    public Optional<Till> get(Integer id) {
        var result = getCurrentSession().get(Till.class, id);
        if (result != null) {
            getCurrentSession().delete(result);
            return Optional.of(result);
        } else return Optional.empty();
    }

    @Override
    public int update(Till till) {
        if (till.getId() != null) {
            getCurrentSession().update(till);
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteById(Integer id) {
        var result = getCurrentSession().get(Till.class, id);
        if (result != null) {
            getCurrentSession().delete(result);
            return 1;
        } else return 0;
    }


}
