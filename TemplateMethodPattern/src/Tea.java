/**
 * Created by KZ on 7/27/17.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding Lemon");
    }
}
