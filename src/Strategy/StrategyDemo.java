package Strategy;

import java.lang.reflect.Constructor;

/**
 * Created by tmnt on 2017/4/12.
 */
public class StrategyDemo {
    public static void main(String[] args) {

        Good good=new Good(30.0,"game");

        Context context=new Context(good,new Common());
        context.printPrice();

        Context context1=new Context(good,new Associator());
        context1.printPrice();


    }
}
