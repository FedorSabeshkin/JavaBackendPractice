package com.hello.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Cat")
public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Мяу! ");
    }
}
