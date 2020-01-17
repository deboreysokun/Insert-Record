/* Late/lazy sigleton */
package Unit2.Late.Lazy_SingleTon;

public class MainClass2 {
    public static void main(String[] args){
    SingleTon2 sc = SingleTon2.getOBj();
    System.out.println(sc);
    
    SingleTon2 sp = SingleTon2.getOBj();
    System.out.println(sp);
    sp.print();
    }
}
