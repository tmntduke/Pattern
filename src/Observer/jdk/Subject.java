package Observer.jdk;

import java.util.Observable;

/**
 * Created by tmnt on 2017/4/13.
 */
public class Subject extends Observable {
   private  int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
}
