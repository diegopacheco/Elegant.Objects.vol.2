package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

public class MainApp {
    public static void main(String[] args) {
        final Secret secret = new Secret();
        new Farewell(
                new Attempts(
                        new VerboseDiff(
                                new Diff(
                                        secret,
                                        new Guess()
                                )), 5
                ),
                secret
        ).say();
    }
}
