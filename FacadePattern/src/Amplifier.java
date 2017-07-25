/**
 * Created by KZ on 7/24/17.
 */
public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvdPlayer = dvd;
    }

    public void setSurroundSound() {
        System.out.println("Set surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("Set volume " + volume);
    }
}
