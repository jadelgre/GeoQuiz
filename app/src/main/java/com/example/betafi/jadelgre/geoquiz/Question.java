package com.example.betafi.jadelgre.geoquiz;

/**
 * Created by admin on 1/22/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    public enum QUESTION_TYPE { TRUE_FALSE, MULTIPLE_CHOICE, FILL_IN_BLANK }

    public Question(int number, boolean answer) {
        mTextResId = number;
        mAnswerTrue = answer;
    }

    public boolean getAnswerTrue() {
        return mAnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setAnswerTrue(boolean answer) {
        mAnswerTrue = answer;
    }

    public void setTextResId(int number) {
        mTextResId = number;
    }

}
