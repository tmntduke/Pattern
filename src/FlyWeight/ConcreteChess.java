package FlyWeight;

/**
 * ´æ´¢ÄÚ²¿×´Ì¬
 * Created by tmnt on 2017/4/10.
 */
public class ConcreteChess implements Chess{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Location location) {
        System.out.println("x:"+location.getX()+" y:"+location.getY());
    }
}
