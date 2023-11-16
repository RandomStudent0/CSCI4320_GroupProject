package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Camera1Main extends AppCompatActivity {
    private Button recButton;
    private Button playButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera1); // Set the new layout for this activity
        // Additional setup for the new activity

        recButton = findViewById(R.id.recButton);
        playButton = findViewById(R.id.playButton);
        backButton = findViewById(R.id.backButton);

        recButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Camera1Main.this, Camera1Rec.class);
                startActivity(intent);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Camera1Main.this, Camera1Play.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Camera1Main.this, CameraMainActivity.class);
                startActivity(intent);
            }
        });
    }
}