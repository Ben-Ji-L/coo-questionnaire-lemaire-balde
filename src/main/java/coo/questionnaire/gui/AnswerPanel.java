package coo.questionnaire.gui;

import javax.swing.JPanel;
import coo.questionnaire.Answer;

public abstract class AnswerPanel {
    protected Answer<?> answer;

    public AnswerPanel(Answer<?> answer) {
        this.answer = answer;
    }

    public abstract JPanel getPanel();

    public abstract String getAnswerText();
}