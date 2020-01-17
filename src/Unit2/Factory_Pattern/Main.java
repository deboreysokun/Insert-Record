
package Unit2.Factory_Pattern;

import Unit2.Factory_Pattern.Car;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String carName;
        System.out.println("Enter the car you want: ");
        carName = scan.next();
        
        Car car = CarFactory.produceCar(carName);
        car.printInfo();
    }
}
