import java.util.ArrayList;

public class Hat extends CharacterDecorator{
    /**
     * Creates the hat of the character
     * @param character
     */
    public Hat(Character character){
        // note: running this last creates extra big forehead
        super(character);
        ArrayList<String> copier = new ArrayList<>();
        int i = 0;
        for(String line : character.sections) {
            if( i == 1) {
                copier.add("__|____|__");
            }
                copier.add(line);
            i++;
        }
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
