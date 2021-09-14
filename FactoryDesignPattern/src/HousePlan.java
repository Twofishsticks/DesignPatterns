import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    public HousePlan(int numRooms, int numWindows, int squareFeet) {

    }
    abstract void setMaterials();
    abstract void setFeatures();
    public ArrayList<String> getFeatures() {
        return null;
    }
    public ArrayList<String> getMaterials() {
        return null;
    }
    public int getNumRooms() {
        return 0;
    }
    public int getNumWindows() {
        return 0;
    }
    public int getSquareFeet() {
        return 0;
    }
    public String toString() {
        return null;
    }
}
