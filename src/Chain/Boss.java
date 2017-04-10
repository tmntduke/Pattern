package Chain;

/**
 * Created by tmnt on 2017/4/10.
 */
public class Boss extends Leader {
    public Boss(String name) {
        super(name);
    }

    @Override
    public void handle(Leave leave) {

        if (leave.getDays() <= 10) {
            System.out.println(name + " pass");
        } else {
            System.out.println("pass");
        }
    }
}
