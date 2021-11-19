import java.util.Random;

public class Easy implements State{
    private ArithemeticGame game;
    public int getNum() {
        return (int)(Math.random()*(10-1)+1);
    }
    public String getOperation() {
        int operatorSignal = (int)(Math.random()*(2-1)+1);
        if (operatorSignal== 1) {
            return "+";
        } else {
            return "-";
        }
    }
    public void levelUp() {

    }
    public void levelDown() {

    }
}
