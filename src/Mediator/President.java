package Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmnt on 2017/4/11.
 */
public class President implements Mediator {

    private Map<String, Depatment> depatmentMap = new HashMap<String, Depatment>();

    @Override
    public void register(String name, Depatment depatment) {
        depatmentMap.put(name, depatment);
    }

    @Override
    public void commond(String name) {
        if (depatmentMap.get(name) != null) {
            depatmentMap.get(name).selfAction();
        }
    }
}
