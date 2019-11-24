package coo.questionnaire;

import coo.questionnaire.gui.AnswerPanel;

public abstract class Answer<T> {
    protected T value;

    public Answer(T theGoodAnswer) {
        this.value = theGoodAnswer;
    }

    public T getValue() {
        return this.value;
    }

    public abstract boolean accept(String var1);

    public abstract String instruction();

    public boolean isCorrect(String text) {
        return this.value.toString().equals(text);
    }

    public String toString() {
        return this.value.toString();
    }

    public abstract AnswerPanel createMyAnswerPanel();
}