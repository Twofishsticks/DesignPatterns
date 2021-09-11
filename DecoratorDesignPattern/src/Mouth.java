import java.util.ArrayList;

public class Mouth extends CharacterDecorator{
    /**
     * Creates the mouth of the character
     * @param character
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> copier = new ArrayList<>();
        int i = 0;
        for(String line : character.sections) {
            if( i == 5) {
                copier.add("  \\ ---- / ");
            } else {
                copier.add(line);
            }
            i++;
        }
        copier.add("   \\____/ ");
        this.sections = copier;
    }
    /**
     *  Empty Method
     */
    @Override
    void customise() {
        // TODO Auto-generated method stub
        
    }
}
