package com.lab.rest;

import com.lab.entity.Client;
import com.lab.repository.ClientRepository;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({
        "com.lab.controller",
        "com.lab.entity",
        "com.lab.repository"})
@EntityScan("com.lab.entity")
@EnableJpaRepositories(basePackages = "com.lab.repository")
public class RestApplication {

    private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ClientRepository repository) {
        return (args -> {
            //repository.save(new Client("test@example.com", "123456"));
        });
    }
}
