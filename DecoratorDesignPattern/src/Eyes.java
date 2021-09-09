import java.util.ArrayList;

public class Eyes extends CharacterDecorator{
    public Eyes(Character character) {
        ArrayList<String> copier = new ArrayList<>();
        int i = 0;
        for(String line : sections) {
            if( i == 3) {
                copier.add(" |  o  o  | ");
            } else {
                copier.add(line);
            }
            i++;
        }
        sections = copier;
    }
    @Override
    void customise() {
        // TODO Auto-generated method stub
        
    }
}
