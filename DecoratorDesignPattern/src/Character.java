import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;
    public Character() {
        sections = new ArrayList<>();
    }
    public void draw() {
        for (String part : sections) {
            System.out.println(part);
        }
    }
}
