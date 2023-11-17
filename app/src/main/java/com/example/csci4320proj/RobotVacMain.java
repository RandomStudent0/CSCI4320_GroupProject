package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RobotVacMain extends AppCompatActivity {
    private Button chargeButton;
    private TextView chargeText;

    private Button room1Button;

    private Button room2Button;
    private Button room3Button;



    private TextView room1Text;
    private TextView room2Text;
    private TextView room3Text;

    private TextView suctionQuiet;
    private TextView suctionMedium;
    private TextView suctionMaximum;
    private Button quietButton;
    private Button mediumButton;
    private Button maximumButton;

    private Button backButton;

    private Button offButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robot_vac); // Set the new layout for this activity

        chargeButton = findViewById(R.id.chargeButton);
        chargeText = findViewById(R.id.chargeText);

        room1Button = findViewById(R.id.room1Button);

        room2Button = findViewById(R.id.room2Button);
        room3Button = findViewById(R.id.room3Button);


        room1Text = findViewById(R.id.room1Text);
        room2Text = findViewById(R.id.room2Text);
        room3Text = findViewById(R.id.room3Text);

        quietButton = findViewById(R.id.quietButton);
        mediumButton = findViewById(R.id.mediumButton);
        maximumButton = findViewById(R.id.maximumButton);

        suctionQuiet = findViewById(R.id.suctionQuiet);
        suctionMedium = findViewById(R.id.suctionMedium);
        suctionMaximum = findViewById(R.id.suctionMaximum);

        offButton = findViewById(R.id.offButton);

        backButton = findViewById(R.id.backButton);


        chargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chargeText.getVisibility() == View.INVISIBLE) {
                    chargeText.setVisibility(View.VISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                }
            }
        });

        room1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (room1Text.getVisibility() == View.INVISIBLE) {
                    room1Text.setVisibility(View.VISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                }
            }
        });

        room2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (room2Text.getVisibility() == View.INVISIBLE) {
                    room2Text.setVisibility(View.VISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                }
            }
        });

        room3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (room3Text.getVisibility() == View.INVISIBLE) {
                    room3Text.setVisibility(View.VISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    room1Text.setVisibility(View.INVISIBLE);
                    room2Text.setVisibility(View.INVISIBLE);
                    room3Text.setVisibility(View.INVISIBLE);
                }
            }
        });

        quietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suctionQuiet.getVisibility() == View.INVISIBLE) {
                    suctionQuiet.setVisibility(View.VISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                } else {
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suctionMedium.getVisibility() == View.INVISIBLE) {
                    suctionMedium.setVisibility(View.VISIBLE);
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                } else {
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        maximumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suctionMaximum.getVisibility() == View.INVISIBLE) {
                    suctionMaximum.setVisibility(View.VISIBLE);
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                } else {
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        offButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suctionMaximum.setVisibility(View.INVISIBLE);
                suctionQuiet.setVisibility(View.INVISIBLE);
                suctionMedium.setVisibility(View.INVISIBLE);
                room1Text.setVisibility(View.INVISIBLE);
                room2Text.setVisibility(View.INVISIBLE);
                room3Text.setVisibility(View.INVISIBLE);
                chargeText.setVisibility(View.INVISIBLE);
            }
        });



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RobotVacMain.this, MainIOTPage.class);
                startActivity(intent);
            }
        });


    }
}

