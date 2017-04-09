package Decorator;

/**
 * Created by tmnt on 2017/4/9.
 */
public class DecoratorDemo {
    public static void main(String[] args) {

        Car car=new Car();

        Fly fly=new Fly(car);

        fly.move();

        System.out.println("##################");

        Auto auto=new Auto(new Swim(car));

        auto.move();
    }
}
