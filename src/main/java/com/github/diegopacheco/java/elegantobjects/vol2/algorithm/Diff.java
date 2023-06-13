package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

public class Diff {

    private final Secret secret;
    private final Guess guess;

    public Diff(Secret secret, Guess guess) {
        this.secret = secret;
        this.guess = guess;
    }

    int number(){
        return guess.number() - secret.number();
    }

}
