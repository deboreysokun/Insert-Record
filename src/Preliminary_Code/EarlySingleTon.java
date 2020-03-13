
package Preliminary_Code;

import Unit2.Early.Eager_SingleTon.SingleTon;

public class EarlySingleTon {
    private int id = 1101801041;
    private String name = "Deborey Sokun";
    private static EarlySingleTon sc = new EarlySingleTon();
    private EarlySingleTon(){}
    public static EarlySingleTon getInsatnce()
    {
    return sc;
    }
    
    public void print(){
        System.out.println(id+":"+name);}
    
}

