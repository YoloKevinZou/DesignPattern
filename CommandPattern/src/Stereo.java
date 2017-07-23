/**
 * Created by KZ on 7/23/17.
 */
public class Stereo {
    int volume = 0;
    String description;

    public Stereo(String desc) {
        description = desc;
    }

    public void on() {
        System.out.println(description + " stereo is on");
    }

    public void off() {
        System.out.println(description + " stereo is off");
    }

    public void setCd() {
        System.out.println(description + " stereo set CD for input");
    }

    public void setDvd() {
        System.out.println(description + " stereo set DVD for input");
    }

    public void setRadio() {
        System.out.println(description + " stereo set Radio for input");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(description + " stereo is set to: " + this.volume);
    }
}
