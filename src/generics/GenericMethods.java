package generics;

/**
 * Created by Katsura on 2016-07-25.
 */
public class GenericMethods {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public <T,R,S> void g(T t,R r,S s){
        System.out.println(
                t.getClass().getName() +'\n'+
                r.getClass().getName() + '\n'+
                s.getClass().getName() + '\n'

        );
    }

    public <T,R> void h(T t,R r,Integer i){
        System.out.println(
                t.getClass().getName() + '\n'+
                r.getClass().getName() + '\n'+
                i.getClass().getName() + '\n'
        );
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0f);
        gm.f('c');
        gm.f(gm);
        System.out.println();
        gm.g("",1,1.0);
        gm.g(1.0f,'c',gm);
        System.out.println();
        gm.h("",1.0,1);
        gm.h('c',1.0f,2);
    }
}


