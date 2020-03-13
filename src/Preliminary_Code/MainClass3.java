
package Preliminary_Code;

public class MainClass3 {
    static SingleTon_Thread obj= null;
    public static void main(String[] args){        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj = SingleTon_Thread.getInstace();
                System.out.println(obj);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj = SingleTon_Thread.getInstace();
                System.out.println(obj);
            }
        });
        t1.start();
        t2.start();
    }
}
