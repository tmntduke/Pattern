package Factory.FactoryMethod;

import Factory.Audi;
import Factory.Car;

/**
 * Created by tmnt on 2017/4/1.
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {

        Car car=new AudiCarFactory().create();
        car.run();
    }
}
