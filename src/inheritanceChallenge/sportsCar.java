package inheritanceChallenge;

public class sportsCar extends Car{

    public sportsCar(String model, int steeringWheel, int gears, int wheels, int seats, boolean sunroof) {
        super(model, steeringWheel, gears, wheels, seats, sunroof);
    }

    @Override
    public void steering() {
        System.out.println("sportsCar.steering() called");
        super.steering();
    }
}
