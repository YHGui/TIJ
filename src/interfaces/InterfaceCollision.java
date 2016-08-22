package interfaces;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Katsura on 2016-07-20.
 */
interface I1{
    void f();
}
interface I2{
    int f(int i);
}

interface I3{
    int f();
}

class C{
    public int f(){
        return 1;
    }
}

class C2 implements I1,I2{
    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 1;
    }
}

class C3 extends C implements I2{
    @Override
    public int f(int i) {
        return 1;
    }
}

class C4 extends C implements I3{

}

/*class C5 extends innerclasses.C implements I1{
    public void f(){}
}*/

/*interface I4 extends I1,I3{

}*/
public class InterfaceCollision {
    public static void main(String[] args) {
        C4 c4 = new C4();
        System.out.println(c4.f());
        C2 c2 = new C2();
        System.out.println(c2.f(2));
        C3 c3 = new C3();
        System.out.println(c3.f()+","+c3.f(3));
        C c = new C();
        System.out.println(c.f());
    }
}
