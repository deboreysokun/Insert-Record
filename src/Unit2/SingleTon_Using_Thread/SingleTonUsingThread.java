
package Unit2.SingleTon_Using_Thread;

public class SingleTonUsingThread {
    private int id;
    private String name; 
    private static SingleTonUsingThread sc = null;
    private static Object lock = new Object();
    private static Object lock2 = new Object();
    private SingleTonUsingThread(){}

    public static SingleTonUsingThread getObj(){
        synchronized(lock){
        if (sc == null) {
        sc = new SingleTonUsingThread();
        }
        }
        synchronized (lock2){
        System.out.println("Hello");
        System.out.println("World");
        }
        return sc;
        }

    public void print(){
    System.out.println(id+" : "+name);
    }
    }
   

