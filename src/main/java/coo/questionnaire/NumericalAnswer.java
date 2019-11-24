package coo.questionnaire;

import coo.questionnaire.gui.AnswerPanel;
import coo.questionnaire.gui.NumericalAnswerPanel;

public class NumericalAnswer extends Answer<Integer> {

    public NumericalAnswer(Integer theGoodAnswer) {
        super(theGoodAnswer);
    }

    public NumericalAnswer(String answerText) {
        this(Integer.parseInt(answerText));
    }

    public boolean accept(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException var3) {
            return false;
        }
    }

    public String instruction() {
        return "nombre";
    }

    @Override
    public AnswerPanel createMyAnswerPanel() {
        return new NumericalAnswerPanel(this);
    }
}
