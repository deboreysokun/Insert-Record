/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preliminary_Code.AdaptorPattern;
public class Iphone implements IphoneCharger{
    
    @Override
    public void charge() {  
        System.out.println("Charging on Iphone device...");
        
    }
    
}
