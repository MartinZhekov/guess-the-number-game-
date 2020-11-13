package org.martinzhekov.config;

import org.martinzhekov.GuessCount;
import org.martinzhekov.MaxNumber;
import org.martinzhekov.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.martinzhekov")
@PropertySource("classpath:config/game.properties")
public class GameConfig {
    //== fields ==
    @Value("${game.maxNumber}")
    private int maxNumber;

    @Value("${game.guessCount}")
    private int guessCount;

    @Value("${game.minNumber}")
    private int minNumber;

    //== bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber(){
        return this.maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return this.minNumber;
    }
}
