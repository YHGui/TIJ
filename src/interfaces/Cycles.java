package interfaces;

/**
 * Created by Katsura on 2016-07-20.
 */
interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Unicycle has one wheel.";
    }
}

class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    @Override
    public String toString() {
        return "Bicycle has two wheels";
    }

    @Override
    public void ride() {
        System.out.println(this);
    }
}

class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tricycle has three wheels";
    }
}
public class Cycles {
    public static void main(String[] args) {
        Cycle[] cycle = {new Unicycle(),new Bicycle(),new Tricycle()};
        for(Cycle c:cycle)
            c.ride();
    }

}
