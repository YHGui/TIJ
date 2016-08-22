package innerclasses.B;

import innerclasses.A.First;

/**
 * Created by Katsura on 2016-07-21.
 */
public class Outer {
    protected class inner implements First {
        public inner(){}
        @Override
        public void method1() {
            System.out.println("This is an inner class implementing First");
        }
    }
}
