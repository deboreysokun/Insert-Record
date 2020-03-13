/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2.Adapter_Design_Pattern;

/**
 *
 * @author Borey
 */
public class IphoneToAndroidAdaptor implements IphoneCharger{
    Android android;
    public IphoneToAndroidAdaptor (Android android){
        this.android = android;
    }
    
    @Override
    public void charge() {
       android.charge();
    }
    
}
