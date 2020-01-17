/*

 */
package Unit2.Command_Pattern;
public class CommandPattern {
    public static void main(String[] args) {
        Stock computerStock = new Stock();
        
        BuyStock buyStockOrder = new BuyStock(computerStock);
       // SellStock sellStockOrder = new SellStock(computerStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
       // broker.takeOrder(sellStockOrde r);
        
        broker.placeOrders();
    }
}