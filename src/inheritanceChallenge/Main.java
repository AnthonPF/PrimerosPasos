package inheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Vehicle truck=new Vehicle("Truck", 1, 12, 6);
        sportsCar Porsche=new sportsCar("Sports", 1, 6, 4, 2, true);
        Porsche.steering();
    }
}
