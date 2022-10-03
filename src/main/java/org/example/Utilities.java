package org.example;
import java.util.ArrayList;
import java.util.Random;

public class Utilities {

    private static ArrayList<String> words = new ArrayList<>();
    private static final Random RANDOM = new Random();

    public static String generateWord(){
        return words.get(RANDOM.nextInt(words.size()));
    }

    static  {
        words.add("fun");
        words.add("attack");
        words.add("extinct");
        words.add("have");
        words.add("abridge");
        words.add("catch");
        words.add("glass");
        words.add("job");
        words.add("thinker");
        words.add("shark");
    }
}
