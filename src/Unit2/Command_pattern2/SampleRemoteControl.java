/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2.Command_pattern2;
class SampleRemoteControl {
    Command slot;
    public SampleRemoteControl(){}
    public void setCommand(Command command)
    {
        slot = command;
    }
    public void buttonWasPressed()
    {
        slot.execute();
    }
}
