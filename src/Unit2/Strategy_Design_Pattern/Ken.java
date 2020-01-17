package Unit2.Strategy_Design_Pattern;
class Ken extends Fighter {

    public Ken(KickBehavior kickBehavior, Jumpbehavior jumpbehavior) {
        super(kickBehavior, jumpbehavior);
    }
    
    public void display()
    {
        System.out.println("Ken");
    }
}

