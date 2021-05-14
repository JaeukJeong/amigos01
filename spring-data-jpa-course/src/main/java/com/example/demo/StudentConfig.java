package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student jj = new Student(
               "jj",
               "afc@ddd.net",
               "20201231",
               21
          );
            Student kk = new Student(
                    "kk",
                    "afcdd@ddd.net",
                    "20211231",
                    21
            );

            repository.saveAll(List.of(jj, kk));

        };
    }
}
