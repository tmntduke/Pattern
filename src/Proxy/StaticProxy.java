package Proxy;

/**
 * Created by tmnt on 2017/4/5.
 */
public class StaticProxy implements Star {
    private Real real;


    public StaticProxy(Real real) {
        this.real = real;
    }

    @Override
    public void prepare() {
        System.out.println("proxy prepare");
    }

    @Override
    public void sing() {
        real.sing();
    }

    @Override
    public void handle() {
        System.out.println("proxy handle");
    }
}
