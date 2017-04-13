package Observer.Common;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tmnt on 2017/4/13.
 */
public class ContentSubject<T> implements Subject<T> {

    protected List<Observer> observers = new ArrayList<Observer>();

    private T t;

    @Override
    public void changState(T t) {
        this.t= t;
    }

    @Override
    public T getState() {
        return t;
    }

    @Override
    public List<Observer> register(Observer observer) {
        observers.add(observer);
        return observers;
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }
}
