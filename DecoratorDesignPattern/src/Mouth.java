import java.util.ArrayList;

public class Mouth extends CharacterDecorator{
    public Mouth(Character character) {
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
        this.sections = copier;
    }

    @Override
    void customise() {
        // TODO Auto-generated method stub
        
    }
}
