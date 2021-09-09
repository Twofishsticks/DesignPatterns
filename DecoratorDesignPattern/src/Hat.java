import java.util.ArrayList;

public class Hat extends CharacterDecorator{
    
    public Hat(Character character){
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
    @Override
    void customise() {
        // TODO Auto-generated method stub
        
    }
}
