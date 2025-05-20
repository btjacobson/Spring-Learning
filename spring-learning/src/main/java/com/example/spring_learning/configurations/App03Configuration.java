package com.example.spring_learning.configurations;

import com.example.spring_learning.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App03Configuration {
    @Bean
    public IGame game() {
        return new PacmanGame();
    }

    @Bean
    public IGame marioGame() {
        return new MarioGame();
    }

    @Bean
    public IGame superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public GameRunner gameRunner(IGame game) {
        return new GameRunner(game);
    }
}
