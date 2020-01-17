/*
This is a concrete BuyStock class which implements from the interface Order
 */
package Unit2.Command_Pattern;
public class BuyStock implements Order{
    private Stock computerStock;
    
    public BuyStock (Stock computerStock){
        this.computerStock=computerStock;
    }
    public void execute() {
        computerStock.buy();
    }
    
}
