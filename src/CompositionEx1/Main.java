package CompositionEx1;

public class Main {
    public static void main(String[] args) {
        Roof roof=new Roof(1,"blue", false);
        Walls walls=new Walls(4, "yellow", 1, 2, 1);
        Floor floor=new Floor(40, 1, 4);

        Room room1=new Room(floor, walls, roof);
        roof.pressSwitch();
        walls.hangPicture();
        System.out.println(walls.getPictures());



    }
}
