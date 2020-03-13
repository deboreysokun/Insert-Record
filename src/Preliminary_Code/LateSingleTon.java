
package Preliminary_Code;
public class LateSingleTon {
    private static LateSingleTon obj;
    private LateSingleTon(){}
    public static LateSingleTon getObj(){
    if(obj==null){
        obj = new LateSingleTon();
    }
    return obj;
    }
}