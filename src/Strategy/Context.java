package Strategy;

/**
 * Created by tmnt on 2017/4/12.
 */
public class Context {

    private Good good;
    private Strategy strategy;

    public Context(Good good, Strategy strategy) {
        this.good = good;
        this.strategy = strategy;
    }

    public void printPrice(){
        strategy.getPrice(good);
    }
}
