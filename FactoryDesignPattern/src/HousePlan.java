import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }
    abstract void setMaterials();
    abstract void setFeatures();
    public ArrayList<String> getFeatures() {
        return this.features;
    }
    public ArrayList<String> getMaterials() {
        return this.materials;
    }
    public int getNumRooms() {
        return this.numRooms;
    }
    public int getNumWindows() {
        return this.numWindows;
    }
    public int getSquareFeet() {
        return this.squareFeet;
    }
    public String toString() {
        return null;
    }
}
