package com.hello.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HellospringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void givenInScopeComponents_whenSearchingInApplicationContext_thenFindThem() {
        assertNotNull(applicationContext.getBean(Cat.class));
        assertNotNull(applicationContext.getBean(Dog.class));
        Animal animal = applicationContext.getBean(Dog.class);
        animal.voice();
    }



}
