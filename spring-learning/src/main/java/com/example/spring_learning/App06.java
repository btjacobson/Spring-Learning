package com.example.spring_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Setter Injection

@Component
class BusinessClassTwo {
    Dependency1Two dependency1;

    Dependency2Two dependency2;

    public Dependency1Two getDependency1() {
        return dependency1;
    }

    @Autowired
    public void setDependency1(Dependency1Two dependency1) {
        this.dependency1 = dependency1;
    }

    public Dependency2Two getDependency2() {
        return dependency2;
    }

    @Autowired
    public void setDependency2(Dependency2Two dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1Two {

}

@Component
class Dependency2Two {

}

@Configuration
@ComponentScan
public class App06 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App06.class)) {
            System.out.println(context.getBean(BusinessClassTwo.class));
        } catch (Exception e) {

        }
    }
}
