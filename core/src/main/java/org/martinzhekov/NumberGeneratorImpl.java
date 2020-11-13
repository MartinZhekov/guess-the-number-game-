package org.martinzhekov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by martinzhekov on 9.11.20
 */

@Component
public class NumberGeneratorImpl implements NumberGenerator{
    // == fields ==
    private final Random random = new Random();


    private final int maxNumber;

    private final int minNumber;

    // == constructor ==

    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==
    @Override
    public int next() {
        // example: min=1 max=100 -> max - min=99 -> range 0 - 99 + min -> 1-100
        return this.random.nextInt(this.maxNumber - this.minNumber) + this.minNumber;
    }

    @Override
    public int getMaxNumber() {
        return this.maxNumber;
    }

    @Override
    public int getMinNumber(){
        return this.minNumber;
    }
}
