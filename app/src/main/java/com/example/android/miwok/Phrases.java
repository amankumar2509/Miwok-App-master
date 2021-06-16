package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words= new ArrayList<>();
        words.add(new Word("where are you going?","minto wuksus"));
        words.add(new Word("what is your name?","tinna oyaasins"));
        words.add(new Word("my name is","oyyisa"));
        words.add(new Word("how are you feeling","michakasas"));
        words.add(new Word("i'm feeling","kucchi acchit"));
        words.add(new Word("are you coming","ammas'aa"));
        words.add(new Word("yes i,m coming","haa'aanam"));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}