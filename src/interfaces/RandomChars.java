package interfaces;

import java.util.Random;

/**
 * Created by Katsura on 2016-07-20.
 */
public class RandomChars {
    private static Random rand = new Random();
    public char next(){
        return (char)rand.nextInt(128);
    }
}
