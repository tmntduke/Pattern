package Bridge;

/**
 * Created by tmnt on 2017/4/8.
 */
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("laptop");
    }
}
