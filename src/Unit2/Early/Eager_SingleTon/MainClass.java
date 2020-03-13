/*Design Pattern-Singleton Eager/Early Instantiation
03-12-2019
*/
package Unit2.Early.Eager_SingleTon;

public class MainClass{
    public static void main(String[] args){
        SingleTon s = SingleTon.getObj();
        s.print();
       
        SingleTon sp = SingleTon.getObj();
        System.out.println(sp);
        sp.print();
    }
    }

