package innerclasses;

import java.util.Collections;

/**
 * Created by Katsura on 2016-07-21.
 */
public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }

        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Contents c = q.contents();
        Destination d = q.to("Borneo");
        System.out.println(c);
        System.out.println(d);

        Parcel2.Contents c1 = q.contents();
        Parcel2.Destination d1 = q.to("Hello");
        System.out.println(c1);
        System.out.println(d1);
    }
}
