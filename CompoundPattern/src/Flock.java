import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by KZ on 8/26/17.
 */
public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();
//    ArrayList<Observer> observers;
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);

    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        System.out.println("HERE");
        notifyObserver();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Register flock observer");
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
//        Iterator iterator = observers.iterator();
//        while (iterator.hasNext()) {
//            Observer obs = (Observer) iterator.next();
//            obs.notify();
//        }
    }
}
