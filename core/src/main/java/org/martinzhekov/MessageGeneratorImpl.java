package org.martinzhekov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by martinzhekov on 10.11.20
 */


public class MessageGeneratorImpl implements MessageGenerator{
   private static final Logger logger = LoggerFactory.getLogger(MessageGeneratorImpl.class);


    @Autowired
    private Game game;
    private final int guessCount = 10;
 
    // == init ==
    @PostConstruct
    public void init(){
        logger.info("game = {}", game);
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "getMainMessage() called";
    }

    @Override
    public String getResultMessage() {
        return "This is result message";
    }
}
