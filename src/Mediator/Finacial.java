package Mediator;

/**
 * Created by tmnt on 2017/4/11.
 */
public class Finacial implements Depatment{

    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("finacial");
    }

    @Override
    public void request(String request) {
        mediator.commond(request);
    }
}
