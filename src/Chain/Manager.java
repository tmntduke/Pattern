package Chain;

/**
 * Created by tmnt on 2017/4/10.
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handle(Leave leave) {
        if (leave.getDays() <= 5) {
            System.out.println(name + " pass");
        } else {
            leader.handle(leave);
        }
    }
}
