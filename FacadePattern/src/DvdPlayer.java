/**
 * Created by KZ on 7/24/17.
 */
public class DvdPlayer {

    Amplifier amplifier;

    public void on() {
        System.out.println("Dvd on");
    }

    public void off() {
        System.out.println("Dvd off");
    }

    public void stop() {
        System.out.println("Dvd stop");
    }

    public void eject() {
        System.out.println("Dvd eject");
    }

    public void play(String movie) {
        System.out.println("Dvd play movie " + movie);
    }
}
