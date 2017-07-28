/**
 * Created by KZ on 7/27/17.
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourIntoCup();
        addCondiment();
    }

    public void boilWater() {
        System.out.println("Boil Water");
    }

    public void pourIntoCup() {
        System.out.println("Pour beverage into cup");
    }

    abstract void brew();
    abstract void addCondiment();
}
