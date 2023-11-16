package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CameraMainActivity extends AppCompatActivity {
    private Button viewCam1Button;
    private Button viewCam2Button;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_camera); // Set the new layout for this activity
        // Additional setup for the new activity

        viewCam1Button = findViewById(R.id.viewCam1Button);
        viewCam2Button = findViewById(R.id.viewCam2Button);
        backButton = findViewById(R.id.backButton);


        viewCam1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CameraMainActivity.this, Camera1Main.class);
                startActivity(intent);
            }
        });

        viewCam2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CameraMainActivity.this, Camera2Main.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CameraMainActivity.this, MainIOTPage.class);
                startActivity(intent);
            }
        });
    }
}