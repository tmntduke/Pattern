package Observer.Common;

/**
 * Created by tmnt on 2017/4/13.
 */
public class ObserverA<T> implements Observer {

    private T state;

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
    }

    @Override
    public void update(Subject subject) {
        this.state = (T) subject.getState();
        System.out.println("current state:"+state);
    }
}
