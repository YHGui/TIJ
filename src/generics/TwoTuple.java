package generics;

/**
 * Created by Katsura on 2016-07-24.
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a,B b){
        first = a;
        second = b;
    }
    public String toString(){
        return "(" + first + "," + second + ")";
    }
}
