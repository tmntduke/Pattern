package Chain;

/**
 * Created by tmnt on 2017/4/10.
 */
public class ChainDemo {
    public static void main(String[] args) {

        Director director = new Director("director");
        Manager manager = new Manager("manger");
        Boss boss = new Boss("boss");

        director.nextLeader(manager);
        manager.nextLeader(boss);

        director.handle(new Leave(2));
    }
}
