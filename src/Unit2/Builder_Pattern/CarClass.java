
package Unit2.Builder_Pattern;

import Unit2.Builder_Pattern.BuilderPattern;

public class CarClass {
    public static void main(String[] args) {
        BuilderPattern c = new BuilderPattern.CarBuilder().
                SetBrand("Toyota").
                SetColor("Black").
                SetEngineType("Oil cooled").
                build();
        System.out.println(c);
    }
}
