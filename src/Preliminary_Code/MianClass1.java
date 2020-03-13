
package Preliminary_Code;

public class MianClass1 {
    public static void main(String[] args) {
        EarlySingleTon obj = EarlySingleTon.getInsatnce();
        System.out.println(obj);
        obj.print();
    }
}
