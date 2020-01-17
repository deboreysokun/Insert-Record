package Unit2.Strategy_Design_Pattern;
interface KickBehavior {
    public void kick();
}
class LightningKick implements KickBehavior
{
    public void kick()
    {
        System.out.println("Lightning kick");
    }    
}

class TornadoKick implements KickBehavior
{
    public void kick() 
    {
        System.out.println("Tornado Kick");
    }
}
