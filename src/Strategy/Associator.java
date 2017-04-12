package Strategy;

/**
 * Created by tmnt on 2017/4/12.
 */
public class Associator implements Strategy {

    @Override
    public void getPrice(Good good) {
        System.out.println("discount 30%:" + good.getPrice() * 0.3);
    }
}
