package Status;

/**
 * Created by tmnt on 2017/4/13.
 */
public class FreeStatus implements Status {
    @Override
    public void handle() {
        System.out.println("free");
    }
}
