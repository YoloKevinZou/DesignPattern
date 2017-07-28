/**
 * Created by KZ on 7/27/17.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
