package coo.questionnaire.gui;

import javax.swing.*;
import java.awt.*;

import coo.questionnaire.*;

public class QuestionPanel extends JPanel {

    protected JLabel text;
    protected AnswerPanel inputAnswerPanel;
    protected Question question;

    public QuestionPanel(Question question) {
        this.question = question;
        this.text = new JLabel("  " + question.getQuestionText() + " : ");
        this.setLayout(new GridLayout(1, 2));
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.text.setAlignmentY(0.5F);
        this.add(this.text);
        AnswerPanel inputAnswerPanel = this.createInputAnswerPanel();
        inputAnswerPanel.getPanel().setAlignmentY(0.5F);
        this.add(inputAnswerPanel.getPanel());
    }

    private AnswerPanel createInputAnswerPanel() {
        return this.question.getTheGoodAnswer().createMyAnswerPanel();
    }

    public void setAnswer() {
        this.question.setUserAnswer(this.inputAnswerPanel.getAnswerText());
    }
}
