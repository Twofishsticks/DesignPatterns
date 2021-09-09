import java.util.ArrayList;

public class Nose extends CharacterDecorator{
    public Nose(Character character){
        ArrayList<String> copier = new ArrayList<>();
        int i = 0;
        for(String line : sections) {
            if( i == 4) {
                copier.add("  |   >    |  ");
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
