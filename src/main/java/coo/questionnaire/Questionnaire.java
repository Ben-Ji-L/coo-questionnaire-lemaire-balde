package coo.questionnaire;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Questionnaire {

    private List<Question> questions = new ArrayList();
    private int nbPoints;

    public Questionnaire() {

    }

    public void askAll() {
        this.nbPoints = 0;
        Iterator it = this.questions.iterator();

        while(it.hasNext()) {
            Question quest = (Question)it.next();
            System.out.println("-----------------------------------------");
            System.out.println(quest.getQuestionText());
            boolean valid = false;
            String answer = null;

            while(!valid) {
                try {
                    System.out.println("Quelle est votre réponse [" + quest.getTheGoodAnswer().instruction() + "] ? ");
                    answer = Input.readLine();
                    valid = quest.isAcceptable(answer);
                } catch (IOException var6) {
                    answer = "";
                    valid = false;
                }
            }

            quest.setUserAnswer(answer);
            if (quest.isUserAnswerCorrect()) {
                System.out.println("correct, (" + quest.getNbOfPoints() + " point(s))");
                this.nbPoints += quest.getNbOfPoints();
            } else {
                System.out.println("incorrect, la bonne reponse etait " + quest.getTheGoodAnswer());
            }
        }

        System.out.println("Vous avez obtenu " + this.nbPoints + " point(s)");
    }

    public void addQuestion(Question questionToAdd) {
        this.questions.add(questionToAdd);
    }

}