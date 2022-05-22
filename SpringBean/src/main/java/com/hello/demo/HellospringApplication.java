package com.hello.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellospringApplication {


    private Animal animal;

    public void useImplementation() {
        animal.voice();
    }

    @Autowired
    public HellospringApplication(@Qualifier("Dog") Animal animal) {
        this.animal = animal;
    }


    public static void main(String[] args) {

        SpringApplication.run(HellospringApplication.class, args);
    }

}
