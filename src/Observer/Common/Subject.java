package Observer.Common;

import java.util.List;

/**
 * Created by tmnt on 2017/4/13.
 */
public interface Subject<T> {

    void changState(T t);

    T getState();

    List<Observer> register(Observer observer);

    void remove(Observer observer);

    void notifyAllObserver();

}
