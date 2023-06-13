package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

public class Attempts {

    private final VerboseDiff diff;
    private final int max;

    public Attempts(VerboseDiff verboseDiff, int max) {
        this.diff = verboseDiff;
        this.max = max;
    }

    boolean matches() {
        int t = 0;
        while (t < this.max &&
                this.diff.number() != 0) {
            ++t;
        }
        return t <= this.max;
    }
}
