package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

public class Farewell {

    private final Attempts attempts;
    private final Secret secret;

    public Farewell(Attempts attempts, Secret secret) {
        this.attempts = attempts;
        this.secret = secret;
    }

    void say() {
        if (!this.attempts.matches()) {
            System.out.println("You lost, Sorry. It was: "
                    + this.secret.number());
        }
        System.out.println("Thanks for Playing with me!");
    }
}
