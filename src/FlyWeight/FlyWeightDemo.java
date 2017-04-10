package FlyWeight;

/**
 * Created by tmnt on 2017/4/10.
 */
public class FlyWeightDemo {
    public static void main(String[] args) {

        Location location=new Location(20,30);
        Location location1=new Location(10,25);

        Chess chess=FlyWeightFactory.getChress("black");
        System.out.println(chess);
        chess.display(location);

        System.out.println("##########");
        Chess chess1=FlyWeightFactory.getChress("black");
        System.out.println(chess);
        chess1.display(location1);

    }
}
