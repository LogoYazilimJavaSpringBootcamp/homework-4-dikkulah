package org.dikkulah.repository;

import lombok.SneakyThrows;
import org.dikkulah.model.Till;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TillJdbcImp implements AbstactRepository<Till, Integer> {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/isbasi";
    static final String USER = "postgres";
    static final String PASS = "postgrepw";
    static final String SQL_INSERT = "INSERT INTO tills (id,currency,is_active,name,opening_balance,opening_balance_date) VALUES(?,?,?,?,?,?)";
    static final String SQL_UPDATE = "UPDATE tills set  currency=?,is_active=?,name=?,opening_balance=?,opening_balance_date=? WHERE id=?";
    static final String SQL_SELECT_ALL = "SELECT * FROM tills ";
    static final String SQL_SELECT_BY_ID = "SELECT * FROM tills WHERE id =? ";
    static final String SQL_DELETE_BY_ID = "DELETE FROM tills WHERE id =? ";
    int id = 1;

    @Override
    @SneakyThrows
    public List<Till> findAll() {
        List<Till> tills = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_ALL)) {
            var result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String currency = result.getString("currency");
                Boolean is_active = result.getBoolean("is_active");
                String name = result.getString("name");
                Double opening_balance = result.getDouble("opening_balance");
                Date opening_balance_date = result.getDate("opening_balance_date");
                Till till = new Till(id, name, currency, opening_balance, opening_balance_date, is_active);
                tills.add(till);
            }
        }
        return tills;
    }

    @SneakyThrows
    @Override
    public int insert(Till till) {
        till.setId(id++);
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {
            stmt.setInt(1, till.getId());
            stmt.setString(2, till.getCurrency());
            stmt.setBoolean(3, till.getIsActive());
            stmt.setString(4, till.getName());
            stmt.setDouble(5, till.getOpeningBalance());
            stmt.setDate(6, till.getOpeningBalanceDate());
            return stmt.executeUpdate();
        }

    }

    @Override
    @SneakyThrows
    public Optional<Till> get(Integer id) {
        Till till = null;
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_BY_ID)) {
            stmt.setInt(1, id);
            var result = stmt.executeQuery();
            while (result.next()) {
                int id2 = result.getInt("id");
                String currency = result.getString("currency");
                Boolean is_active = result.getBoolean("is_active");
                String name = result.getString("name");
                Double opening_balance = result.getDouble("opening_balance");
                Date opening_balance_date = result.getDate("opening_balance_date");
                till = new Till(id, name, currency, opening_balance, opening_balance_date, is_active);
            }
        }
        return Optional.ofNullable(till);
    }

    @Override
    @SneakyThrows
    public int update(Till till) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE)) {
            stmt.setString(1, till.getCurrency());
            stmt.setBoolean(2, till.getIsActive());
            stmt.setString(3, till.getName());
            stmt.setDouble(4, till.getOpeningBalance());
            stmt.setDate(5, till.getOpeningBalanceDate());

            stmt.setInt(6, till.getId());

            return stmt.executeUpdate();
        }
    }

    @Override
    @SneakyThrows
    public int deleteById(Integer id) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL_DELETE_BY_ID)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate();
        }
    }
}
