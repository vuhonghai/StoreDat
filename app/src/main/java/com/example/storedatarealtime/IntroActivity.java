package com.example.storedatarealtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    CardView vocaburyCard, quizCard, dicCard, profileCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        vocaburyCard = findViewById(R.id.studyCard);
        quizCard = findViewById(R.id.vocabularymyCard);
        dicCard = findViewById(R.id.dicCard);
        profileCard = findViewById(R.id.profileCard);

        vocaburyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, VocabularyActivity.class);
                startActivity(intent);
            }
        });

        quizCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        dicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, DictionaryActivity.class);
                startActivity(intent);
            }
        });
        profileCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}