
package Unit2.Factory_Pattern;

import Unit2.Factory_Pattern.Car;
import Unit2.Factory_Pattern.Benz;
import Unit2.Factory_Pattern.BMW;
import Unit2.Factory_Pattern.Audi;

public class CarFactory {
    public static Car produceCar(String carName){
        if(carName.equals("Audi")){
            return new Audi();
        }
        else if(carName.equals("BMW")){
            return new BMW();
        }
        else if (carName.equals("Benz")){
            return new Benz();
        }
        else{
            return null;
        }
    }
}
