package com.ivankoi.baeldung.springboot.springbootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ivankoi.baeldung.springboot.springbootstart.persistence.repo")
@EntityScan("com.ivankoi.baeldung.springboot.springbootstart.persistence.model")
@SpringBootApplication
public class SpringbootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStartApplication.class, args);
    }
}
