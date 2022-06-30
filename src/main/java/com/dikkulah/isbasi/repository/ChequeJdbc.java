package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Cheque;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@Repository
public class ChequeJdbc implements ChequeRepository {




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