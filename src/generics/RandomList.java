package generics;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by Katsura on 2016-07-25.
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s: ("The quick brown fox jumped over" +
        "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++) {
            System.out.print(rs.select() + " ");
        }

        System.out.println();
        RandomList<Integer> rsi = new RandomList<Integer>();
        for(Integer i : Arrays.asList(1,2,3,4,5,6))
            rsi.add(i);
        for (int i = 0; i < 6; i++) {
            System.out.print(rsi.select() + " ");
        }

        System.out.println();

        Random rand = new Random(47);
        RandomList<Time> rsd = new RandomList<Time>();
        for (int i = 0; i < 10 ; i++) {
            rsd.add(new Time(rand.nextLong()));
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(rsd.select() + " ");
        }
    }


}
