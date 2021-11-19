import java.util.Scanner;

public class ArithemeticGame {
    Easy easy;
    Medium medium;
    Hard hard;
    State state;
    int score;
    Scanner reader;
    public ArithemeticGame() {

    }
    public void setState(State state) {
        this.state = state;
    }
    public Easy getEasyState() {
        return easy;
    }
    public Hard getHardState() {
        return hard;
    }
    public Medium getMediumState() {
        return medium;
    }
    
    public void pressQuestionButton() {

    }

}
