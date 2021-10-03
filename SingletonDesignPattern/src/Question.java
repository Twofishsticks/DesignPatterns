public class Question {
    private String Question;
    private String[] answers = new String[4]; 
    private int CorrectAnswer;
    /**
     * Creates the Question class
     * @param question
     * @param ans1
     * @param ans2
     * @param ans3
     * @param ans4
     * @param CorrectAnswer
     */
    public Question (String question, String ans1, String ans2, String ans3, String ans4, int CorrectAnswer) {
        this.Question = question;
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.CorrectAnswer = CorrectAnswer;
    }
    /**
     * Returns the object Question as a string
     */
    public String toString() {
        String returny = this.Question+ "\n\n";
        returny += " 1. " + answers[0] + "\n\n";
        returny += " 2. " + answers[1] + "\n\n";
        returny += " 3. " + answers[2] + "\n\n";
        returny += " 4. " + answers[3] + "\n\n";
        return returny;
    }
    /**
     * Checks if the user answer = the correct answer-1
     * @param UserAnswer
     * @return if they are the same
     */
    public boolean isCorrect(int UserAnswer) {
        boolean correct = false;
        if (UserAnswer-1 == CorrectAnswer){
            correct = true;
        }
        return correct;
    }
    /**
     * gets the correct answer
     * @return correct answer
     */
    public String getCorrectAnswer() {
        if (CorrectAnswer >= answers.length) {
            return null;
        }
        return ((CorrectAnswer+1)+ ". " + answers[CorrectAnswer]);
    }
}
