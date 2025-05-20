package com.example.spring_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Field injection

@Component
class BusinessClass {
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class App05 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App05.class)) {
            System.out.println(context.getBean(BusinessClass.class));
        } catch (Exception e) {

        }
    }
}
