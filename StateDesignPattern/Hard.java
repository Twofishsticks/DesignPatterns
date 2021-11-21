public class Hard implements State{
    private ArithemeticGame game;
    public Hard (ArithemeticGame game) {
        this.game = game;
    }
    public int getNum() {
        return (int)(Math.random()*(100-1)+1);
    }
    public String getOperation() {
        int operatorSignal = (int)(Math.random()*(4-1)+1);
        if (operatorSignal== 1) {
            return "+";
        } else if (operatorSignal == 2) {
            return "-";
        } else if (operatorSignal == 3) {
            return "*";
        } else  {
            return "/";
        }
    }
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }
}
