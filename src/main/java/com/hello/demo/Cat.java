package com.hello.demo;

import org.springframework.stereotype.Component;


public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Мяу! ");
    }
}
