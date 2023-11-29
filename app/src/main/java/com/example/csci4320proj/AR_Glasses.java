package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AR_Glasses extends AppCompatActivity {
    private Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ar_glasses); // Set the new layout for this activity
        // Additional setup for the new activity

        BackButton = findViewById(R.id.BackButton);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AR_Glasses.this, MainIOTPage.class);
                startActivity(intent);
            }
        });

    }
}
