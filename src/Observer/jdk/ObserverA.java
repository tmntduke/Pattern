package Observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by tmnt on 2017/4/13.
 */
public class ObserverA implements Observer {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void update(Observable o, Object arg) {
        state = ((Subject) o).getState();
    }
}
