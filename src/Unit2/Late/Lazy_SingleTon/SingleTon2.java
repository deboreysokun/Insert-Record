
package Unit2.Late.Lazy_SingleTon;

public class SingleTon2 {
    private static SingleTon2 sc = null;
    private SingleTon2(){}
    
    public static SingleTon2 getOBj(){
    if(sc==null)
        sc = new SingleTon2();
    return sc;
    }
    
    public void print(){
        System.out.println("Hello world...");
    }
}
