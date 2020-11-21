package org.martinzhekov.service;

import lombok.extern.slf4j.Slf4j;
import org.martinzhekov.Game;
import org.martinzhekov.MessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by martinzhekov on 21.11.20
 */

@Slf4j
@Service
public class GameServiceImpl implements GameService{

    // == fields ==
    private final Game game;
    private final MessageGenerator messageGenerator;

    // == constructor ==
    @Autowired
    public GameServiceImpl(Game game, MessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    // == init ==
    @PostConstruct
    public void init(){
        log.info("number = {}", this.game.getNumber());
        log.info("main message = {}", this.messageGenerator.getMainMessage());
    }

    // == public methods ==
    @Override
    public boolean isGameOver() {
            return this.game.isGameWon() || this.game.isGameLost();
    }

    @Override
    public String getMainMessage() {
        return this.messageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage() {
        return this.messageGenerator.getResultMessage();
    }

    @Override
    public void checkGuess(int guess) {
        this.game.setGuess(guess);
        this.game.check();
    }

    @Override
    public void reset() {
        this.game.reset();
    }
}
