//Creating the Remote Control
package Preliminary_Code.CommandPattern;

import Preliminary_Code.CommandPattern.Command;

public class SampleRemoteControl {
    public SampleRemoteControl(){}
    Command cmd;
    public void setCommand(Command command) {
        cmd= command;
    }
    public void buttonWasPressed(){
        cmd.execute();
    }
}
