
package Unit2.Early.Eager_SingleTon;

public class SingleTon {
    
    private int id;
    private String name;
    private static SingleTon s = new SingleTon();
    private SingleTon(){}
    
    public static SingleTon getObj(){
    return s;
    }
    
    public void print(){
        System.out.println(id+":"+name);
    }
}

