/*
Light class and the corresponding command
 */
package Unit2.Command_pattern2;
public class Light {
    public void on()
    {
        System.out.println("Light is on!");
    }
    public void off()
    {
        System.out.println("Light is off!");
    }   
}

class LightOnCommand implements Command
{
    Light light;
    public LightOnCommand(Light light)
    {
        this.light = light;
    }
    public void execute() {
        light.on();
    }   
}
class LightOffCommand implements Command
{
    Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute() {
        light.off();
    }   
}