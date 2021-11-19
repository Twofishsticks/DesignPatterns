public class Medium implements State {
    private ArithemeticGame game;
    public int getNum() {
        return (int)(Math.random()*(50-1)+1);
    }
    public String getOperation() {
        int operatorSignal = (int)(Math.random()*(3-1)+1);
        if (operatorSignal== 1) {
            return "+";
        } else if (operatorSignal == 2) {
            return "-";
        } else {
            return "*";
        } 
    }
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to hard mode.");
    }
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to medium mode.");
    }  
}
