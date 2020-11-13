package org.martinzhekov.config;

import org.martinzhekov.GuessCount;
import org.martinzhekov.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    //== fields ==
    private int maxNumber = 50;

    private int guessCount = 8;

    //== bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber(){
        return this.maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCoun123t(){
        return guessCount;
    }
}
