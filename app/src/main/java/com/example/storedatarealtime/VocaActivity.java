package com.example.storedatarealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VocaActivity extends AppCompatActivity {

    Button yourvocabutton, myvocabutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voca);
        yourvocabutton = findViewById(R.id.vocaburyCard);
        myvocabutton = findViewById(R.id.quizCard);

        yourvocabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VocaActivity.this, YourVActivity.class);
                startActivity(intent);
            }
        });
        myvocabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VocaActivity.this, QuizActivity.class);
                startActivity(intent);

            }
        });
    }
}