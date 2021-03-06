package CompositionEx1;

public class Roof {
    private int lamp;
    private String colour;
    private boolean isFanOn;

    public Roof(int lamp, String colour, boolean isFanOn){
        this.lamp=lamp;
        this.colour=colour;
        this.isFanOn=isFanOn;
    }

    public void pressSwitch(){
        if(isFanOn==false){
            turnOnFan();
        }else{
            turnOffFan();
        }
    }

    private void turnOnFan(){
        isFanOn=true;
        System.out.println("Fan is on");
    }

    private void turnOffFan(){
        isFanOn=false;
        System.out.println("Fan is off");
    }

    public int getLamp(){
        return lamp;
    }

    public String getColour(){
        return colour;
    }

    public boolean getIsFanOn(){
        return isFanOn;
    }

}
