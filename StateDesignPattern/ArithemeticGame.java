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
        easy = new Easy(this);
        state = easy;
        medium = new Medium(this);
        hard = new Hard(this);
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
    // runs through one question
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String op = state.getOperation();
        int correct = 0;
        int whatevertheuserputsin;
        System.out.println(num1 + op + num2);
        if (op.equals("+")) {
            correct = num1+num2;
        } else if (op.equals("-")) {
            correct = num1 - num2;
        } else if (op.equals("*")) {
            correct = num1 * num2;
        } else if (op.equals("/")) {
            correct = num1 / num2;
        } 
        whatevertheuserputsin = reader.nextInt();
        if (whatevertheuserputsin == correct) {
            score++;
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
            score--;
        }
        if (score >= 3) {
            state.levelUp();
            score = 0;
        }
        if (score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

}
