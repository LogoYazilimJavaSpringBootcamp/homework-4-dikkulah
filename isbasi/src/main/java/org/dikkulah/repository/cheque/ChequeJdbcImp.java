package org.dikkulah.repository.cheque;

import org.dikkulah.model.Cheque;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@Repository
public class ChequeJdbcImp implements ChequeRepository {




    @Override
    public List<Cheque> findAll() {

        log.info("jdbc");
        return new ArrayList<>();
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
