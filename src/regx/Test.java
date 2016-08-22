package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Katsura on 2016-07-23.
 */
public class Test {
    public static void main(String[] args) {
        /*System.out.println("abc".matches("..."));
        System.out.println("a8279a".replaceAll("\\d","_"));
        Pattern p = Pattern.compile("[a-z]{3}");
        Matcher m =  p.matcher("fgh");
        boolean b = m.matches();
        System.out.println(b);*/

        /*System.out.println("a".matches("."));
        System.out.println("aa".matches("aa"));
        System.out.println("aa".matches("a*"));
        System.out.println("aaaa".matches("a+"));
        System.out.println("aaaa".matches("a?"));
        System.out.println("".matches("a?"));
        System.out.println("214523145234532".matches("\\d{3,100}"));
        System.out.println("192.168.1.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        System.out.println("192".matches("[0-2][0-9][0-9]"));
        */
/*
        System.out.println("a".matches("[abc]"));
        System.out.println("a".matches("[^abc]"));
        System.out.println("A".matches("[a-zA-Z]"));
        System.out.println("R".matches("[A-Z&&[RFG]]"));*/

        /*System.out.println("\n\r\t".matches("\\s{4}"));
        System.out.println(" ".matches("\\S"));
        System.out.println("a_8".matches("\\w{3}"));
        System.out.println("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
        System.out.println("\\".matches("\\\\"));*/
        /*System.out.println("hello sir".matches("^h.*"));
        System.out.println("hello sir".matches(".*ir$"));
        System.out.println("hello sir".matches("^h[a-z]{1,3}o\\b.*"));

        System.out.println(" \n".matches("^[\\s&&[^\\n]]*\\n$"));*/
        //开头是空白符但不是换行符，然后到末尾跟着换行符
        //单词边界则与数字相分离

        //System.out.println("shd-fhdjs@shdjds.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
        Pattern p = Pattern.compile("\\d{3,5}");
        String s = "123-34345-234-00";
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
        m.reset();
        System.out.println(m.find());
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.find());
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.find());
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.find());

        System.out.println(m.lookingAt());
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.lookingAt());
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.lookingAt());
        System.out.println(m.start());
        System.out.println(m.end());
    }
}
