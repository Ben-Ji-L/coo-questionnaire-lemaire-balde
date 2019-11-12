package coo.questionnaire;

import java.io.*;

public class QuestionnaireFactory {

    public Question createQuestion(String text, String answer, String points) throws Exception {
        try {
            int nbPoints = Integer.parseInt(points);
            return new Question(text, AnswerFactory.FACTORY.buildAnswer(answer), nbPoints);
        } catch (NumberFormatException var5) {
            throw new IOException("bad format");
        }
    }

    public Questionnaire createQuestionnaire(String fileName) throws IOException {
        Questionnaire questionnaire = new Questionnaire();
        File source = new File(fileName);
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(source));

            String text;
            while((text = in.readLine()) != null) {
                String answer = in.readLine();
                String nbPoints = in.readLine();
                if (answer == null || nbPoints == null) {
                    throw new IOException("bad format");
                }

                questionnaire.addQuestion(this.createQuestion(text, answer, nbPoints));
            }
        } catch (FileNotFoundException var11) {
            throw new IOException(var11);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

        return questionnaire;
    }

}
