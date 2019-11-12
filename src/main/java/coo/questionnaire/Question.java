package coo.questionnaire;

public class Question {

    protected String text;
    protected String theUserTextAnswer;
    protected final Answer<?> theGoodAnswer;
    protected int nbPoints;

    public Question(String t, Answer<?> a, int nbP) {
        this.text = t;
        this.theGoodAnswer = a;
        this.nbPoints = nbP;
    }

    public int getNbOfPoints() {
        return this.nbPoints;
    }

    public String getQuestionText() {
        return this.text;
    }

    public boolean isAcceptable(String userAnswer) {
        return this.theGoodAnswer.accept(userAnswer);
    }

    public boolean isUserAnswerCorrect() {
        return this.theGoodAnswer.isCorrect(this.theUserTextAnswer);
    }

    public void setUserAnswer(String userAnswerText) {
        this.theUserTextAnswer = userAnswerText;
    }

    public Answer<?> getTheGoodAnswer() {
        return this.theGoodAnswer;
    }

    public String getTheUserAnswer() {
        return this.theUserTextAnswer;
    }

}
