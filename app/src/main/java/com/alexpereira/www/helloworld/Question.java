package com.alexpereira.www.helloworld;

/**
 * Created by alexpereira on 9/13/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswer = false;
    private boolean mIsCheater;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswer = answerTrue;
    }


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }
    public boolean isCheater() {
        return mIsCheater;
    }

    public void setAnswerTrue(boolean answer) {
        mAnswer = answer;
    }
    public void setCheater(boolean cheaterTrue) {
        mIsCheater = cheaterTrue;
    }

}
