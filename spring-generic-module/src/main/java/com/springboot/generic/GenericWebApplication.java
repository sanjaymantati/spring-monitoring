package com.springboot.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.sql.DataSource;

@SpringBootApplication
@EnableScheduling
public class GenericWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericWebApplication.class, args);
    }




    @Autowired
    JdbcTemplate jdbcTemplate;


    @Scheduled(cron = "* * * ? * *")
    public void addData(){
        jdbcTemplate.execute("insert into user (name, status) values ('usr1', 'active');");
    }
}
