package org.martinzhekov.service;

/**
 * Created by martinzhekov on 21.11.20
 */


public interface GameService {
    boolean isGameOver();

    String getMainMessage();

    String getResultMessage();

    void checkGuess(int guess);

    void reset();
}
