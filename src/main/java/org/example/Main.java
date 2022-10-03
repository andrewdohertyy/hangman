package org.example;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.Image.hangmanImage;
import static org.example.Utilities.generateWord;
import static org.example.GameSetup.gameSetup;

public class Main {

    public static String newWord = generateWord();// gets a newRandom word whenever the terminal is run
    public static String[] underscores= new String[newWord.length()];
    public static String[] wordArray = newWord.split("").clone();
    public static int lives = 7; //set number of lives for the user



    public static void main(String[] args) {

        StringBuilder oldGuesses = new StringBuilder ("");

        gameSetup();

        while (lives > 0) {

            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine();

            if(newWord.contains(guess.toLowerCase())){
                System.out.println(guess.toUpperCase() + " is correct, keep guessing!");
                System.out.println(lives + " remaining");

            } else {
                lives--;
                System.out.println(guess.toUpperCase() + " is wrong, try again");
                System.out.println(lives + " remaining");
                hangmanImage();
            }


            for (int i = 0; i < newWord.length(); i++) {
                if(wordArray[i].contains(guess)) {
                    underscores[i] = guess;
                }
            }
            System.out.println(Arrays.toString(underscores));
            System.out.println("Previous guesses: " + oldGuesses.append(guess + ", "));

            if (Arrays.toString(underscores).equals(Arrays.toString(wordArray))) {
                System.out.println("You've won with " + lives + " lives remaining!");
                System.exit(0);
            }
            if(lives == 0) {
                System.out.println("Wrong! You have 0 lives left. Game over. ");
                System.out.println("The word was " + newWord.toUpperCase());
            }
        }
    }
}
