package annotations;

import org.junit.Test;

/**
 * Created by Katsura on 2016-07-30.
 */
public class Testable {
    public void execute(){
        System.out.println("Executing...");
    }

    @Test
    public void testExecute(){
        execute();
    }
}
