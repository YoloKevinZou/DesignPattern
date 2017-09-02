import java.util.*;

/**
 * Created by KZ on 8/26/17.
 */
public class Observable implements QuackObservable {

    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("LDKJFKLDSFJ: " + observers.size());
    }

    @Override
    public void notifyObserver() {
        System.out.println("NOTIFY 1 " + observers.size());
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            System.out.println("NOTIFY 2");
            observer.update(duck);
        }
    }
}
