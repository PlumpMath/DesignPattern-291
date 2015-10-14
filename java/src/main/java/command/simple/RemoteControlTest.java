package command.simple;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-9
 * Time: 下午9:35
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
