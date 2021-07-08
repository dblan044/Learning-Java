public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        
        this.engine = true;
        this.wheels = 4;
    }
    
    public String startEngine(){
        return getClass().getSimpleName() + " engine starting";
    }
    
    public String accelerate(){
        return getClass().getSimpleName() + " accelerating";
    }
    
    public String brake(){
        return getClass().getSimpleName() + " braking";
    }
    
    public String getName(){
        return name;
    }
    
    public int getCylinders(){
        return cylinders;
    }
}
