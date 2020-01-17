
package Unit2.Decorator_Design_Pattern;
public class Stabilizer implements Assault{
    Assault r18;
    public Stabilizer(Assault r18)
    {
        this.r18 = r18;
    }
    
    @Override
    public void aim_fire() {
       r18.aim_fire();
        System.out.println("*Accurracy +100");
    }
    
}
