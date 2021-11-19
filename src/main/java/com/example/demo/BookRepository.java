package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}