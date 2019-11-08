package coo.questionnaire;

public class QuestionnaireMain {
    public static void main(String[] args) {
        QuestionnaireFactory factory = new QuestionnaireFactory();
        String file = "question_tolkien.txt";

        if (args.length > 1)
            file = args[0];

    }
}
