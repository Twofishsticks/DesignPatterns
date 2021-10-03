import java.util.ArrayList;
import java.util.Scanner;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score; // how many games won
    private Scanner reader;
    private ArrayList<Question> questions;
    /**
     * Creates an instance of Trivia game, alongside everything it would need
     * Such as: a list of questions, a scanner for user input
     */
    private TriviaGame() {
        reader = new Scanner(System.in);
        this.questions = DataLoader.getTriviaQuestions();
    }
    /**
     * Checks if Trivia game has been created, if not, creates it.
     * @return this
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    /**
     * Loops through the game, increasing the score for each correct round
     * At the end of each round asks if user would like to play another
     * After the user does not play another round, outputs total score
     */
    public void play() {
        // while player keeps playing, play round, update score, etc.
        String playing = "p"; // change to p once ready, bc infinite loop
        while (playing.toLowerCase().equals("p")){
            boolean increase = playRound();
            if (increase) score++;
            playing = reader.nextLine();
            // if input != p or q 
            while (!(playing.toLowerCase().equals("p") || playing.toLowerCase().equals("q"))) {
                // error message + ask for input again
                System.out.print("Would you like to (P)lay or (Q)uit?");
                playing = reader.nextLine();
            }
        }
        System.out.println("Number of games won: " + score + "\n Goodbye!");
    }
    /**
     * Picks a random trivia question, and displays it,
     * Asks the user to enter an answer
     * outputs messages based on type of answer (correct = happy, error = error, etc.)
     * @return if the user got the question correct
     */
    private boolean playRound() {
        boolean answer = false;
        int sizeQuestions = questions.size();
        int randomQuestion = (int)(Math.random()*sizeQuestions);
        System.out.println(questions.get(randomQuestion));
        int answered = reader.nextInt();
        if (answered > 4 || answered <= 0) {
            System.out.print("ERROR: answer is not within the confines of the question!\n");
            return false;
        }
        answer = questions.get(randomQuestion).isCorrect(answered);

        if (answer) {
            System.out.print("Good job! That's correct! \n");
            return answer;
        } else {
            System.out.print("Sorry, that's not right.\n");
            return answer;
        }
    }
}
