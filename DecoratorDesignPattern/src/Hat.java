import java.util.ArrayList;

public class Hat extends CharacterDecorator{
    
    public Hat(Character character){
        ArrayList<String> copier = new ArrayList<>();
        int i = 0;
        for(String line : sections) {
            if( i == 1) {
                copier.add("__|____|____");
            }
                copier.add(line);
            i++;
        }
        sections = copier;
    }
    @Override
    void customise() {
        // TODO Auto-generated method stub
        
    }
}
