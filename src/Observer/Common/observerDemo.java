package Observer.Common;

/**
 * Created by tmnt on 2017/4/13.
 */
public class observerDemo {
    public static void main(String[] args) {

        ObserverA<Integer> observerA = new ObserverA();
        observerA.setState(1);
        System.out.println("1:"+observerA.getState());

        ObserverA<Integer> observerA1 = new ObserverA();
        observerA1.setState(2);
        System.out.println("2:"+observerA1.getState());

        ObserverA<Integer> observerA2 = new ObserverA();
        observerA2.setState(3);
        System.out.println("3:"+observerA2.getState());

        Subject<Integer> subject = new ContentSubject();

        subject.register(observerA);
        subject.register(observerA1);
        subject.register(observerA2);

        subject.changState(20);

        subject.notifyAllObserver();
    }
}
