package strings;

import java.util.Formatter;

/**
 * Created by Katsura on 2016-07-22.
 */
public class Receipt {
    private final int WIDTH1 = 15;
    private final int WIDTH3 = 5;
    private final int WIDTH2 = 10;

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    String s1 = "%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + "s\n";

    public void printTitle(){
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "----", "----");
    }

    public void print(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal(){
        f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
