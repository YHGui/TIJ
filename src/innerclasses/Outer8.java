package innerclasses;

/**
 * Created by Katsura on 2016-07-21.
 */

class Outer8 {
    class Inner {
        private int ii1 = 1;
        private int ii2 = 2;

        private void showIi2() {
            System.out.println(ii2);
        }

        private void hi() {
            System.out.println("Inner hi");
        }
    }

    // Need to create objects to access private elements of Inner:
    int oi = new Inner().ii1;

    void showOi() {
        System.out.println(oi);
    }

    void showIi2() {
        new Inner().showIi2();
    }

    void outerHi() {
        new Inner().hi();
    }

    public static void main(String[] args) {
        Outer8 out = new Outer8();
        out.showOi();
        out.showIi2();
        out.outerHi();
    }
}

