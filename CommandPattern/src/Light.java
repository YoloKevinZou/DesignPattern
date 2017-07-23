/**
 * Created by KZ on 7/23/17.
 */
public class Light {

    String description;

    public Light(String desc) {
        this.description = desc;
    }

    public void on() {
        System.out.println(description + " light is On");
    }
    public void off() {
        System.out.println(description + " light is Off");
    }
}
