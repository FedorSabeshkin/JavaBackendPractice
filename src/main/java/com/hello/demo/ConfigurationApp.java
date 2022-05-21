package com.hello.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {

    @Bean
    @Qualifier("Cat")
    public Animal cat(){
        return new Cat();
    }

    @Bean
    @Qualifier("Dog")
    public Animal dog(){
        return new Dog();
    }


}
