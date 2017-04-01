package Factory.SimpleFactory;

import Factory.Car;

/**
 * Created by tmnt on 2017/4/1.
 */


public class SimpleFactoryDemo {
    public static void main(String[] args) {

        Car car=SimpleFactory.create("Audi");
        car.run();

    }
}
