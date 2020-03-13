
package Preliminary_Code;
public class SingleTon_Thread {
    private static SingleTon_Thread th = null;
    private static Object lock = new Object();
    private static Object lock2 = new Object();
    private SingleTon_Thread(){}
    public static SingleTon_Thread getInstace(){
        synchronized(lock)
        {
            if(th==null)
            {
                th = new SingleTon_Thread();
            }
        }
        
        synchronized(lock2)
        {
            System.out.println("Hello");
            System.out.println("World");
        }
        return th;
}  
}
