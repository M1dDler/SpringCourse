package com.m1ddler.spring;

import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;

@Configuration
//@ComponentScan("com.m1ddler.spring")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Dog dogBean(){
        return new Dog();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
