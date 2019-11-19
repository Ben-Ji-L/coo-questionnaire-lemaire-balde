package coo.questionnaire;

public class AnswerFactory {

    public static final AnswerFactory FACTORY = new AnswerFactory();

    public Answer<?> buildAnswer(String answer) {
        if (new NumericalAnswer(1).accept(answer)) {
            return new NumericalAnswer(new Integer(answer));
        } else if (new YesNoAnswer(YesNo.values()[0]).accept(answer)) {
            return new YesNoAnswer(YesNo.valueOf(answer));
        }

        return null;
    }

}
