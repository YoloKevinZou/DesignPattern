/**
 * Created by KZ on 7/23/17.
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String description;
    int speed;

    public CeilingFan(String desc) {
        this.description = desc;
        speed = OFF;
    }

    public void high() {
        System.out.println(description+ " ceiling Fan High");
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        System.out.println(description + "ceiling Fan Off");
    }

    public int getSpeed() {
        return speed;
    }
}
