import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;
    /**
     * Creates a new ArrayList for all
     * sections to be a part of
     */
    public Character() {
        sections = new ArrayList<>();
    }
    /**
     * Runs through each section and 
     * prints them out
     */
    public void draw() {
        for (String part : sections) {
            System.out.println(part);
        }
    }
}
