/**
 * Created by KZ on 8/26/17.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObserver();
}
