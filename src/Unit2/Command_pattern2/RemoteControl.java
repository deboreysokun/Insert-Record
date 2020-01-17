/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2.Command_pattern2;
public class RemoteControl {
    public static void main(String[] args) {
        SampleRemoteControl remote = new SampleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        
        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
        
        remote.setCommand(new StereoOnCommand(stereo));
        remote.buttonWasPressed();
        
        remote.setCommand(new StereoOffCommand(stereo));
        remote.buttonWasPressed();
        
    }
}
