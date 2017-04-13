package Status;

/**
 * Created by tmnt on 2017/4/13.
 */
public class NotFreeStatus implements Status {
    @Override
    public void handle() {
        System.out.println("not free");
    }
}
