import com.sun.security.jgss.GSSUtil;

public class Switch {
    public static void main(String[] args) {

        /*int value=1;
        if(value==1){
            System.out.println("Value was 1");
        }else if(value==2){
            System.out.println("Value was 2");

        }else{
            System.out.println("Value was not 1 or 2");
        }*/

            //hacer lo mismo pero con un switch

        int switchValue=1;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;

        }

        char letter='f';
        switch(letter){
            case 'a':
                System.out.println("a was typed");
                break;
            case 'b':
                System.out.println("b was typed");
                break;
            case 'c':
                System.out.println("c was typed");
                break;
            case 'd':
                System.out.println("d was typed");
                break;
            case 'e':
                System.out.println("e was typed");
                break;
            default:
                System.out.println("a, b, c, d, or e, wasn't typed");
                break;


            }
            String month="janUary";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
                case "june":
                    System.out.println("Jun");
                    break;
            default:
                System.out.println("Not sure");
                break;

        }

    }
}
