import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;
    public Character() {
        sections = new ArrayList<>();
        // create the base first, this is the default (blank face)
        sections.add("   ______   ");
        sections.add("  /      \\ ");
        sections.add(" |        | ");
        sections.add(" |        | ");
        sections.add("  \\      / ");
        sections.add("   \\____/ ");
        // hat edits 0/1, eyes edits 3, nose 4, mouth 6
        // hat gets added to the front, then maybe changes index 1(?)
    }
    public void draw() {
        for (String part : sections) {
            System.out.println(part);
        }
    }
}
