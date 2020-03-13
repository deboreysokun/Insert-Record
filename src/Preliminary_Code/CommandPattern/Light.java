
package Preliminary_Code.CommandPattern;

import Preliminary_Code.CommandPattern.Command;

public class Light {
    public void On(){System.out.println("Light on...");}
    public void Off(){System.out.println("Light off...");}}
    
    class LightOnCommand implements Command{
        Light light;
        public LightOnCommand (Light light){
        this.light =light;
        }
        @Override
        public void execute() {
            light.On();
        }}
    class LightOffCommand implements Command{
        Light light;
        public LightOffCommand (Light light){
            this.light = light;
        }
        @Override
        public void execute() {
            light.Off();
        }
        }  
    
    

