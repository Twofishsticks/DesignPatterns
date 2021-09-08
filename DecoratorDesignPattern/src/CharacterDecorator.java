public abstract class CharacterDecorator {
    protected Character character;
    public CharacterDecorator(Character character) {
        this.character = character;
    }
    abstract void customise();
}
