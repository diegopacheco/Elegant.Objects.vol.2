package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

public class VerboseDiff {

    private final Diff diff;

    public VerboseDiff(Diff diff) {
        this.diff = diff;
    }

    int number(){
        int x = this.diff.number();
        if (x<0){
            System.out.println("Too Small");
        } else if (x>0) {
            System.out.println("Too Big");
        }else{
            System.out.println("Bingo!");
        }
        return x;
    }

}
