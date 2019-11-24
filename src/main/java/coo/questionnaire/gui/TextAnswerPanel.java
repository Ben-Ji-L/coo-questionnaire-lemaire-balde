package coo.questionnaire.gui;

import coo.questionnaire.Answer;

import javax.swing.*;
import java.awt.*;

public class TextAnswerPanel extends AnswerPanel {
    private JTextField answer;

    public TextAnswerPanel(Answer<?> answer) {
        super(answer);
    }

    public JPanel getPanel() {
        JPanel result = new JPanel();
        this.answer = new JTextField("");
        this.answer.setPreferredSize(new Dimension(200, 50));
        this.answer.setAlignmentY(0.5F);
        result.add(this.answer);
        return result;
    }

    public String getAnswerText() {
        return this.answer.getText();
    }
}
