package com.hello.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Dog")
public class Dog implements Animal {

    @Value("${word}")
    private String word;

    @Override
    public void voice() {
        System.out.println(word);
    }
}
