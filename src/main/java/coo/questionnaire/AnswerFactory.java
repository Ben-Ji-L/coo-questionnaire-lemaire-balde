package coo.questionnaire;

public class AnswerFactory {

    public static final AnswerFactory FACTORY = new AnswerFactory();

    public Answer<?> buildAnswer(String answerText) throws Exception {
        Answer<?> answer = new NumericalAnswer(Integer.parseInt(answerText));
        return answer;
    }

}
