package generics;

import java.util.Iterator;

/**
 * Created by Katsura on 2016-07-25.
 */
public class FibonacciAdapter
implements Iterable<Integer>{

    private int count;
    private Fibonacci fib;
    public FibonacciAdapter(Fibonacci fib,int count){
        this.fib = fib;
        this.count = count;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                count--;
                return fib.next();
            }
        };

    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        FibonacciAdapter fibAdapter = new FibonacciAdapter(fib,18);
        for(int i : fibAdapter)
            System.out.print(i + " ");
    }
}
