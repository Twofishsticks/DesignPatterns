public abstract class CharacterDecorator extends Character{
    protected Character character;
    /**
     * Takes in character for the Character Decorator to
     * decorate
     * @param character
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        
    }
    abstract void customise();
}
