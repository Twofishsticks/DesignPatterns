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
    }
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    public void play() {
        // while player keeps playing, play round, update score, etc.
        String playing = "q"; // change to p once ready
        while (playing.toLowerCase().equals("p")){

            if (playRound()) score++;

            // if input != p or q 
            while (!(playing.toLowerCase().equals("y") || playing.toLowerCase().equals("q"))) {
                // error message + ask for input again
            }
        }
    }
    private boolean playRound() {
        //picks random ?n, displays
        // prompts user answer
        // correct = good, return true
        // false = bad, return false
        // else = error message, false
        boolean answer = false;

        return answer;
    }
}
