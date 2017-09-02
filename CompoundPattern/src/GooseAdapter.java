/**
 * Created by KZ on 8/26/17.
 */
public class GooseAdapter implements Quackable {

    Honkable goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
