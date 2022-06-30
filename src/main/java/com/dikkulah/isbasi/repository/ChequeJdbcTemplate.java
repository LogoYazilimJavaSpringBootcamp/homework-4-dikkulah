package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.dto.CommercialDto;
import com.dikkulah.isbasi.model.Cheque;
import com.dikkulah.isbasi.model.Commercial;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class ChequeJdbcTemplate implements ChequeRepository {

    RowMapper<Cheque> rowMapper = (rs, rowNum) -> {
        Cheque cheque = new Cheque();


        cheque.setId(rs.getInt("id"));
        cheque.setChequeDate(rs.getDate("cheque_date"));
        cheque.setTransactionDate(rs.getDate("transaction_date"));
        //cheque.setCommercial(rs.getObject());
        cheque.setPrice(rs.getDouble("price"));
        return cheque;
    };
    @Autowired
    private JdbcTemplate jdbcTemplate;




    @Override
    public List<Cheque> findAll() {
        String sql2 = "SELECT * from commercials,cheques where commercials.id = cheques.commercial_id  ";
        String sql = "SELECT id,cheque_date,transaction_date,price from  cheques ";
        log.info("JDBC Template - CHEQUE - findAll");

        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public void insert(Cheque cheque) {
        String sql = ", cheque_date, transaction_date, commercial_id FROM cheque";
        jdbcTemplate.execute(sql);

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
