package Mediator;

import Chain.Manager;

/**
 * Created by tmnt on 2017/4/11.
 */
public class Development implements Depatment {

    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("development");
    }

    @Override
    public void request(String request) {
        mediator.commond(request);
    }
}
