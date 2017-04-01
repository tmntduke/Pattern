package Factory.FactoryMethod;

import Factory.Audi;
import Factory.Benz;
import Factory.Car;

/**
 * Created by tmnt on 2017/4/1.
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public Car create() {
        return new Benz();
    }
}
