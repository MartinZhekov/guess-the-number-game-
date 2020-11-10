package org.martinzhekov;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by martinzhekov on 9.11.20
 */

@Component
public class NumberGeneratorImpl implements NumberGenerator{
    // == fields ==
    private final Random random = new Random();
    private int maxNumber = 100;

    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
