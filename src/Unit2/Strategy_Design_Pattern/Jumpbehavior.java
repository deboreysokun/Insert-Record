
package Unit2.Strategy_Design_Pattern;

interface Jumpbehavior {
    void jump();
}
class LongJump implements Jumpbehavior
{
    public void jump()
    {
        System.out.println("Long Jump");
    }    
}

class ShortJump implements Jumpbehavior
{
    public void jump() 
    {
        System.out.println("Short Jump");
    }
}
