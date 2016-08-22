package generics.StoryCharacter;

import net.mindvie.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Katsura on 2016-07-25.
 */
public class StoryCharacterGenerator
        implements Generator<StoryCharacter>, Iterable<StoryCharacter>{
    private Class[] types = {
            LukeSkywalker.class,Yoda.class,DarthVader.class,JabbaTheHut.class
    };
    private static Random rand = new Random(47);
    public StoryCharacterGenerator(){}
    private int size = 0;

    public StoryCharacterGenerator(int sz){
        size = sz;
    }
    class StoryCharacterIterator implements Iterator<StoryCharacter>{
        int count = size;

        @Override
        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public void remove() {
            throw new UnsupportedClassVersionError();
        }
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new StoryCharacterIterator();
    }

    public StoryCharacter next(){
        try {
            return (StoryCharacter)types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        StoryCharacterGenerator gen = new StoryCharacterGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        System.out.println();
        for(StoryCharacter sc : new StoryCharacterGenerator(5))
            System.out.println(sc);
    }
}
