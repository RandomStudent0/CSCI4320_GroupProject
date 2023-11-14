
package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Camera1Rec extends AppCompatActivity {

    private Button mainCamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_iot1rec); //It starts the app here
        // Additional setup for the new activity

        mainCamButton = findViewById(R.id.mainCamButton);

        mainCamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Camera1Rec.this, CameraMainActivity.class);
                startActivity(intent);
            }
        });
    }
}