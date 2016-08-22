package innerclasses;

/**
 * Created by Katsura on 2016-07-21.
 */
public class Outer {
    class Inner{
        Inner(){
            System.out.println("This is a inner class");
        }
    }

    Inner inner(){
        return new Inner();
    }

    static void ship(){
        Outer outer = new Outer();
        Inner i = outer.inner();
        Outer.Inner ii = outer.inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner i =outer.inner();
        Outer.Inner ii = new Outer().inner();
    }
}
