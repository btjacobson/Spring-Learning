package com.example.spring_learning;

import com.example.spring_learning.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Primary - A bean should be given preference when multiple candidates are qualified
// @Qualifier - A specific bean should be auto-wired (name of the bean can be used as qualifier)
// Always think from the perspective of the class using the Component
//   1. Just @Autowired - Give me preferred
//   2. @Autowired + @Qualifier - Only want to use a specific component
//   3. @Qualifier has higher priority than @Primary

@Configuration
@ComponentScan("com.example.spring_learning.game")
public class App04 {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App04.class)) {
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
