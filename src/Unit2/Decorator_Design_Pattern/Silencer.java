
package Unit2.Decorator_Design_Pattern;
public class Silencer implements Assault{
    Assault r18;
    public Silencer(Assault r18)
    {
        this.r18 = r18;
    }
    
    @Override
    public void aim_fire() {
        System.out.println("*Noise reduce by 10");
       r18.aim_fire();
        
    }
}
