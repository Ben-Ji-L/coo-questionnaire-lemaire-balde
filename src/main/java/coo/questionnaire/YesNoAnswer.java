package coo.questionnaire;

public class YesNoAnswer extends Answer<YesNo> {

    public YesNoAnswer(YesNo valueOf) {
        super(valueOf);
    }

    @Override
    public boolean accept(String var1) {
        return var1.equals(YesNo.values());
    }

    @Override
    public String instruction() {
        return "oui ou non";
    }
}
