package Bridge;

/**
 * Created by tmnt on 2017/4/8.
 */
public class Computer {
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}
