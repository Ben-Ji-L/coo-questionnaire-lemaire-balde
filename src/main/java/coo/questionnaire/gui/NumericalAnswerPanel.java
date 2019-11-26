package coo.questionnaire.gui;

import javax.swing.*;
import java.awt.*;

import coo.questionnaire.*;

public class NumericalAnswerPanel extends AnswerPanel{

    private JSpinner spinner;

    public NumericalAnswerPanel(NumericalAnswer answer) {
        super(answer);
    }

    public JPanel getPanel() {
        JPanel result = new JPanel();
        this.spinner = new JSpinner();
        this.spinner.setPreferredSize(new Dimension(100, 50));
        this.spinner.setAlignmentY(0.5F);
        result.add(this.spinner);
        return result;
    }

    public String getAnswerText() {
        return this.spinner.getValue().toString();
    }
}
