package innerclasses;

import java.util.Random;

/**
 * Created by Katsura on 2016-07-21.
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}

class Word{
    String s;
    public Word(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Sequence {
    private String s;
    private Object[] items;
    private int next = 0;
    public Sequence(int size,String s){
        items = new Object[size];
        this.s = s;
    }
    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }

        @Override
        public String toString() {
            return s;
        }

        public Sequence getSequence(){
            return Sequence.this;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Sequence sequence = new Sequence(10,"Hello");
        for (int i = 0; i <10 ; i++) {
            //sequence.add(Integer.toString(i));
            sequence.add(Integer.toString(rand.nextInt(i+20)));
        }

        SequenceSelector selector = (SequenceSelector)sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
            System.out.println(selector);
            System.out.println(selector.getSequence());
        }
    }
}
