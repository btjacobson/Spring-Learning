package com.example.spring_learning.configurations;

import com.example.spring_learning.records.RAddress;
import com.example.spring_learning.records.RPerson;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class App02Configuration {
    private String name = "test";
    private int age = 15;
    private String firstLine = "testLine";
    private String city = "city";

    private RAddress address = new RAddress(firstLine, city);
    private RPerson person = new RPerson(name, age, address);

    @Bean
    public String name() {
        return name;
    }

    @Bean
    public int age() {
        return age;
    }

    @Bean
    @Primary
    public RPerson person() {
        return person;
    }

    @Bean
    @Qualifier("person2qualifier")
    public RPerson person2() {
        return person;
    }

    @Bean
    public RPerson person3(String name, int age, RAddress address) {
        return new RPerson(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public RAddress address() {
        return address;
    }
}
