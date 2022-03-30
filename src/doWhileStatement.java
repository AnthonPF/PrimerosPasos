public class doWhileStatement {
    public static void main(String[] args) {

        int count=0;
        while(count !=5){
            System.out.println("Count value is " + count);
            count++;

        }
        count=0;                                    //HACEN LO MISMO
        while(true){
            if(count==5){
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }

        //DO WHILE
        count=1;
        do{
            System.out.println("Count value was " + count);
            count++;
            if(count>100){
                break;
            }
        }while(count !=6);


        System.out.println(isEvenNumber(9));

        System.out.println("***********");

        int number=5;
        int finishNumber=20;
        int evenNumbersCount=0;
        while(number<=finishNumber)  {
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            evenNumbersCount++;
            if(evenNumbersCount>=5){
                break;
            }
            System.out.println("Even number " + number);
            number++;
        }
        System.out.println("Total even numbers found = " + evenNumbersCount);
    }

         //EJERCICIO VIDEO

        public static boolean isEvenNumber(int number){
            if(number % 2 ==0){
                return true;
            }
            return false;
        }


}
