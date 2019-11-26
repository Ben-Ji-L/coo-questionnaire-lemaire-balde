package coo.questionnaire;

import coo.questionnaire.gui.AnswerPanel;
import coo.questionnaire.gui.TextAnswerPanel;

public class TextAnswer extends Answer<String> {

    public TextAnswer(String theGoodAnswer) {
        super(theGoodAnswer);
    }

    public boolean accept(String s) {
    	   try {
               Integer.parseInt(s);
               return false;
           } catch (Exception var3) {
               return true;
           }
    }

    public String instruction() {
        return "text";
    }

    public AnswerPanel createMyAnswerPanel() {
        return new TextAnswerPanel(this);
    }

}
