package Bridge;

/**
 * Created by tmnt on 2017/4/8.
 */
public class BridgeDemo {
    public static void main(String[] args) {

        Computer computer=new PC(new Lenovo());
        computer.sale();
    }
}
