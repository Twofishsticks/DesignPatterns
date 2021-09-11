import java.util.ArrayList;

public class Nose extends CharacterDecorator{
    /**
     * Creates the nose of the character
     * @param character
     */
    public Nose(Character character){
        super(character);
        ArrayList<String> copier = new ArrayList<>();
        int i = 0;
        for(String line : character.sections) {
            if( i == 4) {
                copier.add(" |   >    |");
            } else {
                copier.add(line);
            }
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
