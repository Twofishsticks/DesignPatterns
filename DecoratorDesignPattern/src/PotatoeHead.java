public class PotatoeHead extends Character{
    /**
     * Creates a base for all aterations (hat, nose, etc.)
     */
    public PotatoeHead() {
        super();
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
}
