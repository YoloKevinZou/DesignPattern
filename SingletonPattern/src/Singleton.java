/**
 * Created by KZ on 7/23/17.
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
