package org.dikkulah.config;

import org.dikkulah.repository.cheque.ChequeHibernateImp;
import org.dikkulah.repository.cheque.ChequeJdbcImp;
import org.dikkulah.repository.cheque.ChequeJdbcTemplateImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DBCConfig {
    @Bean(name = "chequeJdbc")
    public ChequeJdbcImp getChequeJdbc(){
        return new ChequeJdbcImp();
    }
    @Bean(name="chequeJdbcTemplate")
    public ChequeJdbcTemplateImp getChequeJdbcTemplate(){
        return new ChequeJdbcTemplateImp();
    }
    @Bean(name="chequeHibernate")
    public ChequeHibernateImp getChequeHibernate(){
        return new ChequeHibernateImp();
    }


}
