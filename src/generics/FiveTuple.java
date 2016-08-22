package generics;

/**
 * Created by Katsura on 2016-07-24.
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E fifth;
    public FiveTuple(A a,B b,C c,D d,E e){
        super(a,b,c,d);
        fifth = e;
    }

    public String toString(){
        return super.toString() + fifth;
    }
}
