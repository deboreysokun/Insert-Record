/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2.Command_pattern2;
public class Stereo {
    public void on()
    {
        System.out.println("Stereo is on!");
    }
     public void off()
    {
        System.out.println("Stereo is off!");
    }
}
class StereoOffCommand implements Command
{
    Stereo stereo;
    public StereoOffCommand(Stereo stereo)
    {
        this.stereo=stereo;
    }
    public void execute() {
        stereo.off();
    }    
}
class StereoOnCommand implements Command
{
    Stereo stereo;
    public StereoOnCommand(Stereo stereo)
    {
        this.stereo=stereo;
    }
   
    public void execute() {
        stereo.on();
    }
}

    

