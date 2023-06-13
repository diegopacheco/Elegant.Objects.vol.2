package com.github.diegopacheco.java.elegantobjects.vol2.algorithm;

import java.util.Scanner;

public class Guess {
    int number(){
        System.out.println("Guess a number 0..9 range: ");
        return new Scanner(System.in).nextInt();
    }
}
