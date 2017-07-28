/**
 * Created by KZ on 7/27/17.
 */
public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourIntoCup();
        if (customerWantsCondiments()) {
            addCondiment();
        }
    }

    public void boilWater() {
        System.out.println("Boil Water");
    }

    public void pourIntoCup() {
        System.out.println("Pour beverage into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();
    abstract void addCondiment();
}
