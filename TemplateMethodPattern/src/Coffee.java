/**
 * Created by KZ on 7/27/17.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew Coffee");
    }

    @Override
    void addCondiment() {
        System.out.println("Add sugar and milk");
    }
}
