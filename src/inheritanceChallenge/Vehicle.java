package inheritanceChallenge;

public class Vehicle {
    private String model;
    private int steeringWheel;
    private int gears;
    private int wheels;

    public Vehicle(String model, int steeringWheel, int gears, int wheels){
        this.model=model;
        this.steeringWheel=steeringWheel;
        this.gears=gears;
        this.wheels=wheels;
    }

    public void steering(){
        System.out.println("Vehicle.steering() called");
    }

    public void gearing(){
        System.out.println("Vehicle.gearing() called");
    }
}

