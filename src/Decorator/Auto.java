package Decorator;

/**
 * Created by tmnt on 2017/4/9.
 */
public class Auto extends Function {
    public Auto(ICar iCar) {
        super(iCar);
    }

    private void auto(){
        System.out.println("auto");
    }

    @Override
    public void move() {
        super.move();
        auto();
    }
}
