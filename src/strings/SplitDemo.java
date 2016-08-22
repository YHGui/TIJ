package strings;

import java.util.Arrays;
import java.util.jar.Pack200;
import java.util.regex.Pattern;

/**
 * Created by Katsura on 2016-07-23.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)
        ));
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input,3)
        ));

        System.out.println(
                Pattern.compile("!!").split(input,3)
        );
        System.out.println(Arrays.toString(input.split("!!")));
    }
}
