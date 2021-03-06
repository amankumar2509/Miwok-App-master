package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words= new ArrayList<>();
        words.add(new Word("father","apa",R.drawable.family_father));
        words.add(new Word("mother","ata",R.drawable.family_mother));
        words.add(new Word("son","angsi",R.drawable.family_son));
        words.add(new Word("daughter","tune",R.drawable.family_daughter));
        words.add(new Word("olderbrother","taachi",R.drawable.family_older_brother));
        words.add(new Word("oldersister","tete",R.drawable.family_older_sister));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }

}