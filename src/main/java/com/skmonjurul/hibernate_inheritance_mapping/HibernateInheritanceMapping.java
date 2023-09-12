package com.skmonjurul.hibernate_inheritance_mapping;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class HibernateInheritanceMapping {
    
    public static void main(String[] args) {
        SpringApplication.run(HibernateInheritanceMapping.class, args);
    }
}
