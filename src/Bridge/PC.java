package Bridge;

/**
 * Created by tmnt on 2017/4/8.
 */
public class PC extends Computer {
    public PC(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("PC");
    }
}
