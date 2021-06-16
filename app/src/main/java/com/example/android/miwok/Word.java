package com.example.android.miwok;

public class Word {
    String mDefaultWord;
    String mMiwokWord;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    public Word(String defaultWord, String miwokWord){
        mMiwokWord=miwokWord;
        mDefaultWord=defaultWord;
    }
    public Word(String defaultWord, String miwokWord,int imageResourceId){
        mMiwokWord=miwokWord;
        mDefaultWord=defaultWord;
        mImageResourceId=imageResourceId;
    }


    private String getmMiwokWord(){
        return mMiwokWord;
    }
    private String getDefaultWord(){
        return mDefaultWord;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;

    }
}
