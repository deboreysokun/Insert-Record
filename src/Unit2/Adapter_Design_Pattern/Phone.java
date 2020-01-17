package Unit2.Adapter_Design_Pattern;
public class Phone {
    public static void main(String[] args) {
        AndroidCharger android = new Android();
        android.charge();
        
        IphoneCharger iphone = new Iphone();
        iphone.charge();
        
        IphoneCharger android2 = new IphoneToIphoneAdaptor(new Android());
        android2.charge();
    }
}
