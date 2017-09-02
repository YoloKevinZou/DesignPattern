/**
 * Created by KZ on 8/26/17.
 */
public class GooseFactory extends AbstractGeeseFactory {
    @Override
    public Honkable createGoose() {
        return new Goose();
    }
}
