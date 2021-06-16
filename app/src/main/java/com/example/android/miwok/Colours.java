package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colours extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words= new ArrayList<>();
        words.add(new Word("red","lutti",R.drawable.color_red));
        words.add(new Word("mustardyellow","chiwita",R.drawable.color_mustard_yellow));
        words.add(new Word("green","chokkoj",R.drawable.color_green));
        words.add(new Word("brown","takanaaki",R.drawable.color_brown));
        words.add(new Word("black","kulki",R.drawable.color_black));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_colors);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}