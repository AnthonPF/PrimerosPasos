package inheritanceChallenge;

public class Car extends Vehicle{

    private int seats;
    private boolean sunroof;


    public Car(String model, int steeringWheel, int gears, int wheels, int seats, boolean sunroof) {
        super(model, steeringWheel, gears, wheels);
        this.seats=seats;
        this.sunroof=sunroof;
    }

    @Override
    public void steering() {
        System.out.println("Car.steering() called");
        super.steering();
    }
}
