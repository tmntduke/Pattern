package Factory.SimpleFactory;

import Factory.Audi;
import Factory.BMW;
import Factory.Benz;
import Factory.Car;

/**
 * ¼òµ¥¹¤³§
 * Created by tmnt on 2017/4/1.
 */
public class SimpleFactory {

    public static Car create(String car) {
        if ("Benz".equals(car)) {
            return new Benz();
        } else if ("Audi".equals(car)) {
            return new Audi();
        } else if ("BMW".equals(car)) {
            return new BMW();
        }
        return null;
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createBenz() {
        return new Benz();
    }

    public static Car createBMW() {
        return new BMW();
    }
}
