package coo.questionnaire;

import java.io.IOException;

public class QuestionnaireMain {
    public static void main(String[] args) {
        QuestionnaireFactory factory = new QuestionnaireFactory();
        String file = "question_tolkien.txt";

        if (args.length > 1)
            file = args[0];

        try {
            Questionnaire questionnaire = factory.createQuestionnaire(file);
            questionnaire.askAll();
        } catch (IOException except) {
            System.out.println(file + " : wrong file");
            System.exit(0);
        }
    }
}
