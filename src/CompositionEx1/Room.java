package CompositionEx1;

public class Room {
    private Floor theFloor;
    private Walls theWalls;
    private Roof theRoof;

    public Room(Floor theFloor, Walls theWalls, Roof theRoof){
        this.theFloor=theFloor;
        this.theWalls=theWalls;
        this.theRoof=theRoof;
    }

}
