package zihao.checkpoint3;

public class TrueFalseQuestion extends Question
{
    private boolean mTFAnswer;

    public TrueFalseQuestion(String text, boolean ans)
    {
        super(text);
        mTFAnswer = ans;
    }

    // checks the user inputs against the answer.
    // returns whether the user answered the question correctly.
    public boolean checkAnswer(boolean userAnswer)
    {
        return (mTFAnswer == userAnswer);
    }

    public boolean getTFAnswer()
    {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer)
    {
        mTFAnswer = TFAnswer;
    }
}