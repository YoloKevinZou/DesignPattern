/**
 * Created by KZ on 7/23/17.
 */
public class GarageDoor {

    String description;

    public GarageDoor(String desc) {
        description = desc;
    }

    public void up() {
        System.out.println("Garage Door Opening");
    }

    public void down() {
        System.out.println("Garage Door Closing");
    }

    public void stop() {
        System.out.println("Garage Door Stop");
    }

    public void lightOn(){
    }

    public void lightOff() {
    }
}
