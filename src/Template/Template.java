package Template;

/**
 * Created by tmnt on 2017/4/12.
 */
public abstract class Template {

    public void take() {
        System.out.println("take");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("evaluate");
    }

    public final void process() {
        take();
        transact();
        evaluate();
    }

}
