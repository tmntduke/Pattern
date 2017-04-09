package Decorator;

/**
 * Created by tmnt on 2017/4/9.
 */
public class Fly extends Function {
    public Fly(ICar iCar) {
        super(iCar);
    }

    private void fly(){
        System.out.println("fly");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
