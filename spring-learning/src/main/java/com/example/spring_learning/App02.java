package com.example.spring_learning;

import com.example.spring_learning.configurations.App02Configuration;
import com.example.spring_learning.records.RPerson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

// Java Bean:
// classes adhering to 3 constraints:
// 1. Public no argument constructor
// 2. Allow access to properties via getters and setters
// 3. Implement java.io.Serializable

// POJO (Plain Old Java Object)
// 1. No constraints
// 2. Any Java Object

// Spring Bean:
// 1. Spring uses IOC container (Bean Factory or Application Context)

public class App02 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App02Configuration.class)) {

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("person3"));

            System.out.println(context.getBean(RPerson.class));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
