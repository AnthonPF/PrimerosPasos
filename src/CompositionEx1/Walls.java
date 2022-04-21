package CompositionEx1;

public class Walls {
    private int numberOfWalls;
    private String colour;
    private int doors;
    private int windows;
    private int pictures;

    public Walls(int numberOfWalls, String colour, int doors, int windows, int pictures){
        this.numberOfWalls=numberOfWalls;
        this.colour=colour;
        this.doors=doors;
        this.windows=windows;
        this.pictures=pictures;
    }

    public void hangPicture(){
        pictures++;
    }

    public int getNumberOfWalls(){
        return numberOfWalls;
    }
    public String getColour(){
        return colour;
    }
    public int getDoors(){
        return doors;
    }
    public int getWindows(){
        return windows;
    }
    public int getPictures(){
        return pictures;
    }

}
