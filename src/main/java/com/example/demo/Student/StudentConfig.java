package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student deniz = new Student( "Deniz", "deniz@gmail.com", LocalDate.of(1993, Month.OCTOBER, 28) );
            Student bora = new Student( "Bora", "bora@gmail.com", LocalDate.of(2014, Month.AUGUST, 22));
            repository.saveAll(List.of(deniz,bora));
        };

    }
}
