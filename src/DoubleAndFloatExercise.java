public class DoubleAndFloatExercise {
    public static void main(String[] args) {

        double numberOfPounds=100d;
        final double poundsPerKilograms=0.45359237d;
        double kilogramsCalculation=100d*poundsPerKilograms;

        System.out.println("For " + numberOfPounds+ " pounds "+ "you get "+ kilogramsCalculation + " kilograms");

    }
}
