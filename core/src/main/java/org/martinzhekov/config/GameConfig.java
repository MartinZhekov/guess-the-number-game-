package org.martinzhekov.config;

import org.martinzhekov.GuessCount;
import org.martinzhekov.MaxNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {
    //== fields ==
    @Value("${game.maxNumber}")
    private int maxNumber;

    @Value("${game.guessCount}")
    private int guessCount;

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
}
