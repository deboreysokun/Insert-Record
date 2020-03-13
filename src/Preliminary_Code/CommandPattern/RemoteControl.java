
package Preliminary_Code.CommandPattern;
import Preliminary_Code.CommandPattern.Light;
public class RemoteControl {
    public static void main(String[] args) {
        SampleRemoteControl remote = new SampleRemoteControl();
        Light light = new Light();

        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        
        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
        
    }
}
