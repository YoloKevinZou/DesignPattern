/**
 * Created by KZ on 7/23/17.
 */
public class LightOnCommands implements Command {
    Light light;

    public LightOnCommands(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
