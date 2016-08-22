package innerclasses;

/**
 * Created by Katsura on 2016-07-21.
 */
class IndependentClass{
    Parcel3 p = new Parcel3();
    Parcel3.Destination d = p.new Destination("Hello");
    IndependentClass(){
        System.out.println("This is an independent class");
    }
}
public class Parcel3 {
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

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
        System.out.println(new IndependentClass());
    }
}
