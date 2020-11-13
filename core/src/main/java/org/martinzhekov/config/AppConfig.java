package org.martinzhekov.config;

import org.martinzhekov.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by martinzhekov on 10.11.20
 */


@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "org.martinzhekov")
public class AppConfig {
    // == bean methods ==
    @Bean
    public NumberGenerator numberGenerator(){
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game(){
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator(){
        return new MessageGeneratorImpl();
    }
}
