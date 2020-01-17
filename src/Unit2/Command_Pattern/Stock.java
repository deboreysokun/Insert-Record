/* Create a request class */
package Unit2.Command_Pattern;
public class Stock {
    private String name ="Computer";
    private int quantity = 10;
    public void buy(){
        System.out.println("Stock : "+name+",Quantity: "+quantity+"have been bought");   
    }
    public void sell(){
        System.out.println("Stock : "+name+",Quantity: "+quantity+"have been sold");   
    }
}
