package com.example.holaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getDatabaseStatus() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return "Connected to the database successfully!";
        } catch (Exception e) {
            return "Error connecting to the database: " + e.getMessage();
        }
    }

    public String getDatabaseTime() {
        try {
            String sql = "SELECT NOW()";
            String now = jdbcTemplate.queryForObject(sql, String.class);
            return "Hola! La fecha y hora actual es: " + now;
        } catch (Exception e) {
            return "Error retrieving date and time: " + e.getMessage();
        }
    }
}
