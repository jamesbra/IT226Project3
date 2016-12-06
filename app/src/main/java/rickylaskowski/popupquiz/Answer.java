package rickylaskowski.popupquiz;

/**
 * Created by Ricky on 12/5/2016.
 */

public class Answer
{
    private String text;
    private boolean isThisTheCorrectAnswer;

    public Answer(String text, boolean isThisTheCorrectAnswer){
        this.text = text;
        this.isThisTheCorrectAnswer = isThisTheCorrectAnswer;
    }

    public boolean isThisTheCorrectAnswer(){
        return isThisTheCorrectAnswer;
    }
    public String getAnswerText(){
        return text;
    }
}

