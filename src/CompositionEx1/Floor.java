package CompositionEx1;

public class Floor {
    private int tiles;
    private int table;
    private int chairs;

    public Floor(int tiles, int table, int chairs) {
        this.tiles = tiles;
        this.table = table;
        this.chairs = chairs;
    }

    public int getTiles() {
        return tiles;
    }
    public int getTable(){
        return table;
    }
    public int getChairs(){
        return chairs;
    }

}
