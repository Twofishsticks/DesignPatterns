public abstract class CharacterDecorator extends Character{
    protected Character character;
    public CharacterDecorator(Character character) {
        this.character = character;
        
    }
    abstract void customise();
}
