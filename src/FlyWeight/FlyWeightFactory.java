package FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmnt on 2017/4/10.
 */
public class FlyWeightFactory {

    public static Map<String, Chess> map = new HashMap<String, Chess>();

    public static Chess getChress(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            Chess chess = new ConcreteChess(color);//可以使用工厂模式创建
            return chess;
        }
    }
}
