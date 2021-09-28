import java.util.ArrayList;
import java.util.Scanner;

public class TriviaGame {
    // underline uml
    private static TriviaGame triviaGame;
    private int score;
    private Scanner reader;
    private ArrayList<Question> questions;
    private TriviaGame() {}
    public TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return this.triviaGame;
    }
    public void play() {

    }
    private boolean playRound() {
        boolean answer = false;
        return answer;
    }
}
