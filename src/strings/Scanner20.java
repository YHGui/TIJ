package strings;

import java.util.Scanner;

/**
 * Created by Katsura on 2016-07-23.
 */
public class Scanner20 {
    int i;
    long l;
    float f;
    double d;
    String s;

    public Scanner20(String s) {
        Scanner stdin = new Scanner(s);
        i = stdin.nextInt();
        l = stdin.nextLong();
        f = stdin.nextFloat();
        d = stdin.nextDouble();
        this.s = stdin.next();
    }

    @Override
    public String toString() {
        return i + " " + l + " "+ f + " "+ d + " "+ s;
    }

    public static void main(String[] args) {
        Scanner20 scanner20 = new Scanner20("17 56789 2.7 3.61412 hello");
        System.out.println(scanner20);
    }
}
