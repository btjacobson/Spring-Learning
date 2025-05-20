package com.example.spring_learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App09 {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
