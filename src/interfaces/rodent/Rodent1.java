package interfaces.rodent;

/**
 * Created by Katsura on 2016-07-20.
 */
abstract class Rodent{
    private String name = "Rodent";
    abstract protected void eat();
    abstract protected void run();
    abstract protected void sleep();
    abstract public String toString();
}

class Mouse extends Rodent{
    private String name = "Mouse";
    @Override
    protected void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Mouse.run()");

    }

    @Override
    protected void sleep() {

        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat extends Rodent{
    private String name = "Rat";

    @Override
    protected void eat() {
        System.out.println("Rat.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Rat.run()");

    }

    @Override
    protected void sleep() {
        System.out.println("Rat.sleep()");

    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent{
    private String name = "Squirrel";

    @Override
    protected void sleep() {
        System.out.println("Squirrel.sleep()");
    }

    @Override
    protected void run() {
        System.out.println("Squirrel.run()");

    }

    @Override
    protected void eat() {
        System.out.println("Squirrel.eat()");

    }

    @Override
    public String toString() {
        return name;
    }
}
public class Rodent1 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for(Rodent r:rodents){
            r = gen.next();
            System.out.println(r.toString());
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
