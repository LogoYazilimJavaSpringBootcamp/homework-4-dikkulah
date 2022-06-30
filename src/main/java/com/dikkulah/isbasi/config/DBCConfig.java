package com.dikkulah.isbasi.config;

import com.dikkulah.isbasi.repository.ChequeJdbc;
import com.dikkulah.isbasi.repository.ChequeJdbcTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DBCConfig {
    @Bean(name = "chequeJdbc")
    public ChequeJdbc getChequeJdbc(){
        return new ChequeJdbc();
    }
    @Bean(name="chequeJdbcTemplate")
    public ChequeJdbcTemplate getChequeJdbcTemplate(){
        return new ChequeJdbcTemplate();
    }



}
