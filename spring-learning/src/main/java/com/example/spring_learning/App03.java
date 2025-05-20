package com.example.spring_learning;

import com.example.spring_learning.configurations.App03Configuration;
import com.example.spring_learning.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03Configuration.class)) {
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
