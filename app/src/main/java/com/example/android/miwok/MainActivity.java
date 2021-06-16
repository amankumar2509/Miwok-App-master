package com.example.android.miwok;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView number=(TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent=new Intent(MainActivity.this,Numbers.class);
                startActivity(numberIntent);
            }
        });
        final TextView member=(TextView) findViewById(R.id.family);
        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent memberIntent=new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(memberIntent);
            }
        });
        final TextView colours=(TextView) findViewById(R.id.colors);
        colours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coloursIntent=new Intent(MainActivity.this,Colours.class);
                startActivity(coloursIntent);
            }
        });
        final TextView phrases=(TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PhraseIntent=new Intent(MainActivity.this,Phrases.class);
                startActivity(PhraseIntent);
            }
        });



    }



}



