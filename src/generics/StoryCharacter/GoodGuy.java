package generics.StoryCharacter;

/**
 * Created by Katsura on 2016-07-25.
 */
public class GoodGuy extends StoryCharacter {
    private static long counter = 0;
    private final long id = counter++;
    private final boolean isGoodGuy = true;

    public String toString(){
        return getClass().getSimpleName() + " " + id + " is goodguy? " + isGoodGuy;
    }
}
