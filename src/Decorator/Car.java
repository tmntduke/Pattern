package Decorator;

/**
 * Created by tmnt on 2017/4/9.
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("car");
    }
}
