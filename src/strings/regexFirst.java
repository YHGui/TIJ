package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Katsura on 2016-07-22.
 */
public class regexFirst {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Z].*[\\.]$");
        Matcher m = p.matcher("Once upon a time.");
        boolean b = m.matches();
        System.out.println(b);
    }
}
