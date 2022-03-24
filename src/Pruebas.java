public class Pruebas {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimetres(6, 0);
        calcFeetAndInchesToCentimetres(150);

    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
    if((feet<0) || (inches<0)|| (inches>12)){
    return -1;
        }
        double centimeters=(feet*30.48)+(inches*2.54);
        System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " cm"  );
        return centimeters;

    }
    public static double calcFeetAndInchesToCentimetres(double inches) {
        if(inches<0){
            return -1;
    }
        double feet=inches/12;
        double remainingInches=inches%12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);
    }
}
