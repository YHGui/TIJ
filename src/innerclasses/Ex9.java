package innerclasses;

/**
 * Created by Katsura on 2016-07-21.
 */
public class Ex9 {
    public static interfaceEx9 mthod2(){
        class ClassEx9 implements interfaceEx9{
            @Override
            public void method1() {
                System.out.println("This is the method of class");
            }
        }

        return new ClassEx9();
    }

    public static void main(String[] args) {
        //Ex9 ex9 = new Ex9();
        mthod2().method1();
    }
}
