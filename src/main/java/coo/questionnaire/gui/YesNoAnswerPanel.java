package coo.questionnaire.gui;

import coo.questionnaire.YesNo;
import coo.questionnaire.YesNoAnswer;

import javax.swing.*;
import java.util.Arrays;

public class YesNoAnswerPanel extends GroupAnswerPanel<YesNo> {
    public YesNoAnswerPanel(YesNoAnswer question) {
        super(question);
    }

    protected void initTheValues() {
        this.theValues = Arrays.asList(YesNo.values());
    }
}
