package com.example.spring_learning;

// Constructor Injection

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClassThree {
    Dependency1Three dependency1;

    Dependency2Three dependency2;

    // Don't need this for constructor injection
    @Autowired
    public BusinessClassThree(Dependency2Three dependency2, Dependency1Three dependency1) {
        this.dependency2 = dependency2;
        this.dependency1 = dependency1;
    }

    public Dependency1Three getDependency1() {
        return dependency1;
    }

    public void setDependency1(Dependency1Three dependency1) {
        this.dependency1 = dependency1;
    }

    public Dependency2Three getDependency2() {
        return dependency2;
    }

    public void setDependency2(Dependency2Three dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1Three {

}

@Component
class Dependency2Three {

}

@Configuration
@ComponentScan
public class App07 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App07.class)) {
            System.out.println(context.getBean(BusinessClassThree.class));
        } catch (Exception e) {

        }
    }
}
