/*
The Driver Class
 */
package Unit2.Strategy_Design_Pattern;
public class StreetFighter {
    public static void main(String[] args) {
        Jumpbehavior shortJump = new ShortJump();
        Jumpbehavior longJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();
        KickBehavior lightningKick = new LightningKick();
        
        Fighter obj = new Ken(lightningKick, shortJump);
        obj.display();
        obj.kick();
        obj.jump();
        
        obj.setJumpBehavior(longJump);
        obj.jump();
    }
} 