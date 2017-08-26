import java.io.Serializable;

/**
 * Created by KZ on 8/5/17.
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
