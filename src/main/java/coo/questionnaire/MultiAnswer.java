package coo.questionnaire;

import coo.questionnaire.gui.AnswerPanel;
import coo.questionnaire.gui.TextAnswerPanel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MultiAnswer extends Answer<List<String>> {

    public static final String MULTI_ANSWER_SEPARATOR = ";";

    public boolean isCorrect(String text) {
        return ((List)this.value).contains(text);
    }

    public MultiAnswer(List<String> theGoodAnswer) {
        super(theGoodAnswer);
    }

    public MultiAnswer(String answerText) {
        super((List<String>) null);
        List<String> answers = new LinkedList();
        Scanner sc = (new Scanner(answerText)).useDelimiter("\\s;\\s");

        while(sc.hasNext()) {
            answers.add(sc.next().trim());
        }

        sc.close();
        this.value = answers;
    }

    public boolean accept(String s) {
        return true;
    }

    public String instruction() {
        return "text - plusieurs reponses possibles";
    }

    public AnswerPanel createMyAnswerPanel() {
        return new TextAnswerPanel(this);
    }

}
