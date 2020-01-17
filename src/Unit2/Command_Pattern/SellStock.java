/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2.Command_Pattern;
public class SellStock {
     private Stock computerStock;
    
    public SellStock (Stock computerStock){
        this.computerStock=computerStock;
    }
    public void execute() {
        computerStock.sell();
    }
}
