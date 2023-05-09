package com.github.diegopacheco.java.elegantobjects.vol2.validatorsandassertions;

import java.util.Date;

/**
 * Principles from the book:
 *  + Volume 1
 *    + dont use -er names
 *    + primary ctors
 *    + Always use interfaces
 *    + Immutability
 *  + Volume 2
 *    + Composable Decorators
 *    + Don't use Compound Names
 *    + Validators and Assertions
 */
public interface Day {
    int distanceTo(Day end);
    Date getDate();
}
