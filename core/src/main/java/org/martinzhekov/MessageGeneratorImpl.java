package org.martinzhekov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by martinzhekov on 10.11.20
 */


public class MessageGeneratorImpl implements MessageGenerator {
    private static final Logger logger = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    //== fields ==
    @Autowired
    private Game game;

    // == init ==
    @PostConstruct
    public void init() {
        logger.info("game = {}", game);
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return String.format("Number is between %d and %d. Can you guess it", game.getSmallest(), game.getBiggest());
    }

    @Override
    public String getResultMessage() {
        if(game.isGameWon()){
            return "You guessed it! The number was " + game.getNumber();
        }else if(game.isGameLost()){
            return "You lost. The number was " + game.getNumber();
        }else if(!game.isValidNumberRange()){
            return "Invalid number range!";
        }else if(game.getRemainingGuesses() == game.getGuessCount()){
            return "What is your first guess ?";
        }else {
            String direction = "Lower";
            if (game.getGuess() < game.getNumber()) {
                direction = "Higher";
            }
            return direction + "! You have " + game.getRemainingGuesses() + " guesses left";
        }
    }
}
