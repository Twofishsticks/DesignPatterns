public class PotatoeHead extends Character{
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
// arraylist is length 7. hat is 0/1, eyes is 3, nose is4, mouth is 5
