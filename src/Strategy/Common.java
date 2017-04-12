package Strategy;

/**
 * Created by tmnt on 2017/4/12.
 */
public class Common implements Strategy {

    @Override
    public void getPrice(Good good) {
        System.out.println("common:" + good.getPrice());
    }
}
