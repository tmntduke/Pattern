package Status;

/**
 * Created by tmnt on 2017/4/13.
 */
public class Context {
    private Status status;

    public void setStatus(Status status) {
        System.out.println("chang status");
        this.status = status;
        status.handle();
    }
}
