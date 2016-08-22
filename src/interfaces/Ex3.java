package interfaces;

/**
 * Created by Katsura on 2016-07-20.
 */
abstract class Dad {
    protected abstract void print();
    Dad() { print(); }
}

class Son extends Dad {
    private int i = 1;

    @Override
    protected void print() {
        System.out.println("Son.i = " + i);
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}
