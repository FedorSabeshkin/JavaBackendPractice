package com.hello.demo;

import org.springframework.stereotype.Component;


public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Гаф! ");
    }
}
