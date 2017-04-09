package Decorator;

/**
 * Created by tmnt on 2017/4/9.
 */
public class Swim extends Function {
    public Swim(ICar iCar) {
        super(iCar);
    }

    private void swim() {
        System.out.println("swim");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
