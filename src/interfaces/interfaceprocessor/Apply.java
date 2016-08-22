package interfaces.interfaceprocessor;

/**
 * Created by Katsura on 2016-07-20.
 */
public class Apply {
    public static void process(Processor p, Object s){
        System.out.print("Using Processor " + p.name());
        System.out.print(p.process(s));
    }
}
