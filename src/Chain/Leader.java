package Chain;

/**
 * Created by tmnt on 2017/4/10.
 */
public abstract class Leader {

    protected Leader leader;

    protected String name;

    public Leader(String name) {
        this.name = name;
    }

    public void nextLeader(Leader leader){
        this.leader=leader;
    }

    /**
     * ¥¶¿Ì«Î«Û
     * @param leave
     */
    public abstract void handle(Leave leave);

}
