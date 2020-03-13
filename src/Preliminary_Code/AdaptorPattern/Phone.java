/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preliminary_Code.AdaptorPattern;
public class Phone {
    public static void main(String[] args) {
        IphoneCharger iphone = new Iphone();
        iphone.charge();
        
        AndroidCharger iphone2 = new AndroidToIphoneAdaptor(new Iphone()); //+adqaptor
       iphone2.charge();
    }
}
