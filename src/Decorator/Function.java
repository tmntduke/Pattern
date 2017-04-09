package Decorator;

/**
 * Created by tmnt on 2017/4/9.
 */
public class Function implements ICar {

    private ICar iCar;

    public Function(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}
