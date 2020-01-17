
package Unit2.Decorator_Design_Pattern;
public class Main {
    public static void main(String[] args) {
        Assault r18 = new R18();
        Assault r18_Satble = new Stabilizer(r18);
        Assault r18_Satble_Silence = new Stabilizer(r18_Satble);
        r18_Satble_Silence.aim_fire();
        
        
    }
}
