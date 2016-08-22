package innerclasses.C;


import innerclasses.A.First;
import innerclasses.B.Outer;

/**
 * Created by Katsura on 2016-07-21.
 */
public class ExtendsClass extends Outer {
    public First getFirst(){
        //Outer outer = new Outer();
        return this.new inner();
    }
}
