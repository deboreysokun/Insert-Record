
package Unit2.Early.Eager_SingleTon;

public class SingleTon {
    
    private int id= 1101801041;
    private String name = "Deborey Sokun";
    private static SingleTon s = new SingleTon();
    private SingleTon(){}
    
    public static SingleTon getObj(){
    return s;
    }
    
    public void print(){
        System.out.println(id+":"+name);
    }
}

