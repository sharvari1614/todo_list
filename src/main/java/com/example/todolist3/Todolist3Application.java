package com.example.todolist3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Todolist3Application {

    @PostMapping("/display")
    public String hello() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Todolist3Application.class, args);
    }
}
