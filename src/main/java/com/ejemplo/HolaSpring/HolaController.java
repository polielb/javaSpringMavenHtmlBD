package com.example.holaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @Autowired
    private DatabaseService databaseService;

    @GetMapping("/hola")
    public String hola() {
	    String databaseTime = databaseService.getDatabaseTime();
        return "Hola Spring. " + databaseTime;
    }

    @GetMapping("/dbstatus")
    public String getDatabaseStatus() {
        return databaseService.getDatabaseStatus();
    }

    @GetMapping("/datetime")
    public String getDatabaseTime() {
        return databaseService.getDatabaseTime();
    }
}
