
package Unit2.Builder_Pattern;

public class BuilderPattern {
    String brand, color, engineType;

    public BuilderPattern(String brand, String color, String engineType) {
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
    }
    public String toString(){
    return color+":"+brand+":"+engineType;
    }
    public static class CarBuilder{
    String brand, color, engineType;
        public CarBuilder SetBrand (String brand){
            this.brand = brand;
            return this;
        }
        public CarBuilder SetColor (String color){
            this.color = color;
            return this;
        }
        public CarBuilder SetEngineType (String engineType){
            this.engineType = engineType;
            return this;
        }
        public BuilderPattern build(){
            BuilderPattern c = new BuilderPattern(brand,color,engineType);
            return c;
        }
    
    }
    
}
