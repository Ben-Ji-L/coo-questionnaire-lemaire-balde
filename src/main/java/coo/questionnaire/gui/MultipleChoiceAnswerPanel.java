package coo.questionnaire.gui;

import coo.questionnaire.MultipleChoiceAnswer;

public class MultipleChoiceAnswerPanel extends GroupAnswerPanel<String> {
    public MultipleChoiceAnswerPanel(MultipleChoiceAnswer answer) {
        super(answer);
    }

    protected void initTheValues() {
        this.theValues = ((MultipleChoiceAnswer)this.answer).getThePropositions();
    }
}
