package com.hello.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellospringApplication {


    Animal animal;
    public void useImplementation(){
        animal.voice();
    }

    public HellospringApplication() {
        useImplementation();
    }

    public static void main(String[] args) {

        SpringApplication.run(HellospringApplication.class, args);
    }

}
