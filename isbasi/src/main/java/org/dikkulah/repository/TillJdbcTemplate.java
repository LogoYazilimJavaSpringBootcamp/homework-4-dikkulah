package org.dikkulah.repository;

import lombok.extern.log4j.Log4j2;
import org.dikkulah.model.Till;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Log4j2
public class TillJdbcTemplate implements AbstactRepository<Till, Integer> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Till> findAll() {

        String sql = "SELECT id,currency,is_active,name ,opening_balance ,opening_balance_date from  tills ";
        log.info("JDBC Template - Till - findAll");
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Till.class));

    }

    @Override
    public int insert(Till till) {
        return jdbcTemplate.update("INSERT INTO tills (id,currency,is_active,name,opening_balance,opening_balance_date) VALUES(?,?,?,?,?,?)",
                till.getId(),till.getCurrency(), till.getIsActive(), till.getName(), till.getOpeningBalance(), till.getOpeningBalanceDate());

    }

    @Override
    public Optional<Till> get(Integer id) {
        Till tutorial = jdbcTemplate.queryForObject("SELECT * FROM tills WHERE id=?",
                BeanPropertyRowMapper.newInstance(Till.class), id);
        if (tutorial != null){
            return Optional.of(tutorial);
        }else return Optional.empty();
    }

    @Override
    public int update(Till till) {
        return jdbcTemplate.update("UPDATE tills set  currency=?,is_active=?,name=?,opening_balance=?,opening_balance_date=? WHERE id=?",
                till.getCurrency(), till.getIsActive(), till.getName(), till.getOpeningBalance(), till.getOpeningBalanceDate(),till.getId());
    }

    @Override
    public int deleteById(Integer id) {
        return jdbcTemplate.update("DELETE FROM tills WHERE id=?", id);

    }
}
