
package Unit2.SingleTon_Using_Thread;

import Unit2.Late.Lazy_SingleTon.SingleTon2;

public class MainClass3 {
    static SingleTon2 sc = null;
    public static void main(String[] args){
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            sc = SingleTon2.getOBj();
            System.out.println(sc);
        }
    });
    
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            sc = SingleTon2.getOBj();
            System.out.println(sc);
        }
    });
    
    t1.start();
    t2.start();
    try{
    t1.join();
    t2.join();
    }catch (Exception e){}
    }
}
