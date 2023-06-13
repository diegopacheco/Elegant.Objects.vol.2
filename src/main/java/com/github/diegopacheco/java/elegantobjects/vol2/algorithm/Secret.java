package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

public class Secret {

    private int number;

    public Secret() {
        this((int)Math.random() * 100);
    }

    public Secret(int number) {
        this.number = number;
    }

    public int number(){
        return this.number;
    }

}
