public class While {
    public static void main(String[] args) {

        int count=0;
        while(count !=6){
            System.out.println("Count value is " + count);
            count++;

        }
        /*count=0;
        /while(true) {
            if(count==5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;*/

        for(int i=6; i!=6; i++){
            System.out.println("Count value is " + count);

        }
                        //DO WHILE
        count=6;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count !=6);

    }
}
