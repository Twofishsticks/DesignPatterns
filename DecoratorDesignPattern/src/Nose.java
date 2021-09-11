import java.util.ArrayList;

public class Nose extends CharacterDecorator{
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
    @Override
    void customise() {
        // TODO Auto-generated method stub
        
    }
}
