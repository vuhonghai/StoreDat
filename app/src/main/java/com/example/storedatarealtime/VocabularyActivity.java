package com.example.storedatarealtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VocabularyActivity extends AppCompatActivity {

    CardView kindCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

       kindCard = findViewById(R.id.peopleCard);
        kindCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VocabularyActivity.this, VocaActivity.class);
                startActivity(intent);
            }
        });
    }
}