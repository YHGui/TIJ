package innerclasses;

/**
 * Created by Katsura on 2016-07-21.
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
