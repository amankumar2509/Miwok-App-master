package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter  extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId) {
        super(context, 0, words);
        mColorResourceId=colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokword);
        miwokTextView.setText(currentWord.mMiwokWord);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultword);
        defaultTextView.setText(currentWord.mDefaultWord);
        ImageView mImageView=(ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            mImageView.setImageResource(currentWord.getImageResourceId());
            mImageView.setVisibility(View.VISIBLE);
        }
        else{
            mImageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
