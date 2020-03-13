/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preliminary_Code.AdaptorPattern;
public class AndroidToIphoneAdaptor implements AndroidCharger{
    Iphone iphone;

    public AndroidToIphoneAdaptor(Iphone iphone) {
        this.iphone = iphone;
    }
    @Override
    public void charge() {
    iphone.charge();}
    
}
