import java.util.Scanner;

public class ArithemeticGame {
    Easy easy;
    Medium medium;
    Hard hard;
    State state;
    int score;
    Scanner reader;
    public ArithemeticGame() {
        score = 0;
        state = easy;
        reader = new Scanner(System.in);
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
// I guess this is the start game
    public void pressQuestionButton() {

    }

}
