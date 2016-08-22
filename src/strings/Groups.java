package strings;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Katsura on 2016-07-23.
 */
public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch,\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        /*Matcher m =
                Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                .matcher(POEM);
        while (m.find()){
            for (int j = 0; j < m.groupCount(); j++) {
                System.out.print("[" + m.group(j) + "]");
            }
            System.out.println();
        }*/

        Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
        Set<String> words = new TreeSet<String>();
        while (m.find())
            words.add(m.group());

        System.out.println("Number of unique non-cap words = " + words.size());
        System.out.println(words);
    }
}
