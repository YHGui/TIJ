package interfaces.interfaceprocessor;

/**
 * Created by Katsura on 2016-07-20.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
