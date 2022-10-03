package org.example;

import java.util.Arrays;

public class GameSetup extends Main{

    public static void gameSetup(){
        Arrays.fill(underscores, "_");

        System.out.println("-------------Welcome to Hangman!--------------");
        System.out.println("Guess a letter, you've got 7 lives, good luck!");
    }
}

