/* The Abstract class for a specific fighter */
package Unit2.Strategy_Design_Pattern;
abstract class Fighter {
    KickBehavior kickBehavior;
    Jumpbehavior jumpBehavior;
    
    Fighter(KickBehavior kickBehavior, Jumpbehavior jumpbehavior){
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpbehavior;
    }
    public void punch()
    {
        System.out.println("Default Punch");
    }
    public void jump()
    {
        jumpBehavior.jump();
    }
    public void kick()
    {
        kickBehavior.kick();
    }
    public void roll()
    {
        System.out.println("Default Roll");
    }
    public void setJumpBehavior(Jumpbehavior jumpBehavior)
    {
        this.jumpBehavior = jumpBehavior;
    }
    public void setKickBehavior(Jumpbehavior jumpBehavior)
    {
        this.kickBehavior = kickBehavior;
    }
    public abstract void display();
}
