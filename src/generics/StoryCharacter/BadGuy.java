package generics.StoryCharacter;

/**
 * Created by Katsura on 2016-07-25.
 */
public class BadGuy extends StoryCharacter{
    private static long counter = 0;
    private final long id = counter++;
    private final boolean isGoodGuy = false;

    public String toString(){
        return getClass().getSimpleName() + " " + id + " is goodguy? " + isGoodGuy;
    }
}
