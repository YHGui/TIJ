package generics;

import java.util.Iterator;

/**
 * Created by Katsura on 2016-07-25.
 */
public class IterableFibonacci
extends Fibonacci implements Iterable<Integer>{
    private  int n;
    public IterableFibonacci(int count){
        n = count;
    }
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
