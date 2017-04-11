package Mediator;

import java.io.Serializable;

/**
 * Created by tmnt on 2017/4/11.
 */
public class MediatorDemo {
    public static void main(String[] args) {

        President president=new President();

        Finacial finacial=new Finacial(president);
        Development development=new Development(president);

        development.selfAction();
        development.request("finacial");

    }
}
