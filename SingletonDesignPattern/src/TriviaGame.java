import java.util.ArrayList;
import java.util.Scanner;

public class TriviaGame {
    // underline uml
    private static TriviaGame triviaGame;
    private int score; // how many games won
    private Scanner reader;
    private ArrayList<Question> questions;
    private TriviaGame() {
        this.questions = DataLoader.getTriviaQuestions();
        System.out.println(questions.get(1).toString());
    }
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    public void play() {
        // this is a loop, goes through the txt, plays the game
    }
    private boolean playRound() {
        boolean answer = false;

        return answer;
    }
}
