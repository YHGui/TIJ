package strings;

import java.util.Arrays;

/**
 * Created by Katsura on 2016-07-23.
 */
public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest..." +
                    "with... a herring!";
    public static void split(String regx){
        System.out.println(Arrays.toString(knights.split(regx)));
    }
    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
        split("the|you");
        System.out.println(knights.replaceAll("[aeiou]","_"));
    }
}
