/**
 * Created by KZ on 7/23/17.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommands lightOn = new LightOnCommands(light);
//
//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
//
//        remote.setCommand(garageDoorOpenCommand);
//        remote.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommands livingRoomLightsOn = new LightOnCommands(livingRoomLight);
        LightOffCommand livingRoomLightsOff = new LightOffCommand(livingRoomLight);
        LightOnCommands kitchenLightsOn = new LightOnCommands(kitchenLight);
        LightOffCommand kitchenLightsOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);


        remoteControl.setCommand(0, livingRoomLightsOn, livingRoomLightsOff);
        remoteControl.setCommand(1, kitchenLightsOn, kitchenLightsOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCdCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
